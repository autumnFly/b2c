package com.csair.b2c.cloud.test.mail.exception;

import com.csair.b2c.cloud.test.common.util.SpringUtils;
import org.springframework.context.MessageSource;

import java.util.Locale;

public class MailException extends RuntimeException {
    private static final long serialVersionUID = -2291594001935827990L;

    private final String errorCode;
    private final String[] errorParams;

    public MailException(String errorCode) {
        this.errorCode = errorCode;
        this.errorParams = new String[0];
    }

    public MailException(String errorCode, String... errorParams) {
        this.errorCode = errorCode;
        this.errorParams = errorParams;
    }

    @Override
    public String getMessage() {
        MessageSource messageSource = ((MessageSource) SpringUtils.
                getBean("messageSourceMessagesExceptions"));
        String msg = messageSource.getMessage(errorCode, errorParams, Locale.getDefault());
        return msg;
    }

    public String getMessage(Locale locale) {
        MessageSource messageSource = ((MessageSource) SpringUtils.
                getBean("messageSourceMessagesExceptions"));
        String msg = messageSource.getMessage(errorCode, errorParams, locale);
        return msg;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
