package com.csair.b2c.test.mybatis.filters;

import org.apache.catalina.ssi.ByteArrayServletOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author yudong
 */
public class ResponseWrapper extends HttpServletResponseWrapper {

    ByteArrayServletOutputStream outputStream = new ByteArrayServletOutputStream();


    public ResponseWrapper(HttpServletResponse response) {
        super(response);
    }

    @Override
    public PrintWriter getWriter() {
        return new PrintWriter(outputStream);
    }

    @Override
    public ServletOutputStream getOutputStream() {
        return outputStream;
    }

    @Override
    public String toString() {
        return new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
    }
}
