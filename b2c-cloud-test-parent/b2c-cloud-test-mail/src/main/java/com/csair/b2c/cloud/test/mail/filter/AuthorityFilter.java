package com.csair.b2c.cloud.test.mail.filter;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.common.constant.ProjectConst;
import com.csair.b2c.cloud.test.common.constant.SessionConst;

@Order(-1)
@WebFilter(urlPatterns = {
		"/order/*",
		"/discount/*"
})
public class AuthorityFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(AuthorityFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();

		logger.info("request url:{},request params:{},session id:{}", req.getRequestURL(),
				JSONObject.toJSONString(req.getParameterMap()), session.getId());
		if(ProjectConst.DEBUG) {
			chain.doFilter(req, res);
			return;
		}
		String userType = (String) session.getAttribute(SessionConst.USER_TYPE);
		if (userType == null) {
			logger.error("user haven't login yet!request url:{},session id:{}",
					req.getRequestURL(), session.getId());
			URI uri = URI.create(req.getRequestURL().toString());
			String csairHostLogin = uri.getScheme() + "://" + uri.getRawAuthority()
					+ "/login/loginPage?redirect="
					+ URLEncoder.encode(req.getRequestURL().toString(), "UTF-8");
			res.sendRedirect(csairHostLogin);
            return;
		}
		chain.doFilter(req, res);

	}

	@Override
	public void destroy() {

	}

}
