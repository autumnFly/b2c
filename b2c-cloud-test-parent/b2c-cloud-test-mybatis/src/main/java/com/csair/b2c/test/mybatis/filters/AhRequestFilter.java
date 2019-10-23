package com.csair.b2c.test.mybatis.filters;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Charsets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.util.StreamUtils;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Order注解对于@WebFilter来说不起作用,从源码上看排序也就是执行顺序是依据Filter的类名
 * <p>
 * 修改请求数据
 *
 * @author yudong
 * @date 2019/3/13
 */
@Order(50)
@WebFilter(urlPatterns = "/*")
public class AhRequestFilter implements Filter {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        RequestWrapper requestWrapper = new RequestWrapper((HttpServletRequest) servletRequest);
        String reqStr = StreamUtils.copyToString(requestWrapper.getInputStream(), Charsets.UTF_8);
        JsonNode jsonNode = objectMapper.readTree(reqStr);
        ObjectNode objectNode = jsonNode.deepCopy();
        objectNode.put("token", ((HttpServletRequest) servletRequest).getHeader("Token"));
        requestWrapper.setBody(objectNode.toString().getBytes(StandardCharsets.UTF_8));
        filterChain.doFilter(requestWrapper, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void destroy() {

    }
}
