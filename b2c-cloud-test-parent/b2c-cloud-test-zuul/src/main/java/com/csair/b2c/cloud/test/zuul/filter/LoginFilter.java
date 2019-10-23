package com.csair.b2c.cloud.test.zuul.filter;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.csair.b2c.cloud.test.common.model.UserDetailBean;
import com.csair.b2c.cloud.test.common.util.RemoteIpHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.util.ZuulRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class LoginFilter extends ZuulFilter {
    private static Logger logger = LoggerFactory.getLogger(LoginFilter.class);
    private Pattern pattern = Pattern.compile(".*/login.*");

    @Override
    public boolean shouldFilter() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        logger.info("match:{}", pattern.matcher(request.getRequestURL().toString()).matches());
        if (pattern.matcher(request.getRequestURL().toString()).matches()) {
            return false;
        }
        return true;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        HttpServletResponse response = context.getResponse();
        HttpSession session = request.getSession(false);
        if (session == null) {
            logger.error("user haven't login yet!request url:{},ip:{}", request.getRequestURL(), RemoteIpHelper.getRemoteIP(request));
            // 令zuul过滤该请求,不路由
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.FOUND.value());
            URI uri = URI.create(request.getRequestURL().toString());
            try {
                String csairHostLogin = uri.getScheme() + "://" + uri.getRawAuthority()
                        + "/b2c/login/loginPage?referrer="
                        + URLEncoder.encode(request.getRequestURL().toString(), "UTF-8");
                response.sendRedirect(csairHostLogin);
                return null;
            } catch (IOException e) {
                throw new ZuulRuntimeException(e);
            }
        }
        SecurityContext securityContext = (SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT");
        Authentication authentication = securityContext.getAuthentication();
        UserDetailBean userDetailBean = ((UserDetailBean) authentication.getPrincipal());
        logger.info("current login user:{}", userDetailBean.getUsername());
        // 可做其他更多公共逻辑处理

        return null;
    }

}
