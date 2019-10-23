package com.csair.b2c.test.mybatis.filters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 修改响应数据
 *
 * @author yudong
 * @date 2018/4/25
 */
@Order(200)
@WebFilter(urlPatterns = "/*")
public class BnResultFilter implements Filter {

    @Value("${info.packagetime}")
    private String packagetime;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        ResponseWrapper responseWrapper = new ResponseWrapper(res);
        filterChain.doFilter(req, responseWrapper);
        String resStr = responseWrapper.toString();
        if (!"".equals(resStr)) {
            resStr = "{\"version\":\"" + packagetime + "\"," + resStr.substring(1);
        }
        PrintWriter writer = res.getWriter();
        writer.write(resStr);
        writer.flush();
    }


    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) {

    }

}

