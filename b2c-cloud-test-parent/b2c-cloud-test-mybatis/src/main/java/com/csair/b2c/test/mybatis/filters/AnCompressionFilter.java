package com.csair.b2c.test.mybatis.filters;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

/**
 * @author yudong
 * @date 2018/4/25
 */
@Order(100)
@WebFilter(urlPatterns = "/*")
public class AnCompressionFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        if (isGzipSupport(req)) {
            res.setHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
            ResponseWrapper responseWrapper = new ResponseWrapper(res);
            filterChain.doFilter(req, responseWrapper);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(gzipOutputStream, StandardCharsets.UTF_8);
            outputStreamWriter.write(responseWrapper.toString());
            outputStreamWriter.close();
            byteArrayOutputStream.writeTo(res.getOutputStream());
        } else {
            filterChain.doFilter(req, res);
        }
    }

    private boolean isGzipSupport(HttpServletRequest req) {
        String encoding = req.getHeader(HttpHeaders.ACCEPT_ENCODING);
        return encoding != null && encoding.contains("gzip");
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) {

    }

}
