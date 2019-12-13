package com.csair.b2c.cloud.test.learn.maven.filter;

import com.csair.b2c.cloud.test.learn.maven.controller.UserController;

import javax.servlet.DispatcherType;
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

/**
 * Created on 2018/9/15.<br/>
 *
 * @author yudong
 */
@WebFilter(urlPatterns = "/signup/*", dispatcherTypes = DispatcherType.REQUEST)
public class JspFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = ((HttpServletRequest) servletRequest);
        if (request.getSession().getAttribute(UserController.ERROR_MSG) == null) {
            HttpServletResponse response = ((HttpServletResponse) servletResponse);
            response.sendRedirect("/user/signup");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }

    }

    @Override
    public void destroy() {

    }
}