package com.csair.b2c.cloud.test.learn.maven.exception;

/**
 * Created on 2018/9/15.<br/>
 *
 * @author yudong
 */
public class BusinessException extends RuntimeException {
    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
