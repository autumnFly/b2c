package com.csair.b2c.cloud.test.mail;

import com.csair.b2c.cloud.test.common.model.Result;
import com.csair.b2c.cloud.test.common.util.ExceptionUtils;
import com.csair.b2c.cloud.test.mail.exception.MailException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.Locale;

/**
 * @author yudong
 */
@ControllerAdvice
public class ControllerAdviceMail {
    public static final String CSAIR_HOST = "csairHost";
    public static final String CURRENT_LOCALE = "currentLocale";
    public static final String SYSTEM_ERROR_CODE = "mail.sys.500";
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private LocaleResolver localeResolver;

    @Autowired
    @Qualifier("messageSourceMessagesExceptions")
    private MessageSource messageSource;

    @ModelAttribute
    public void model(Model model, HttpServletRequest request, UriComponentsBuilder ucb) {
        URI uri = URI.create(request.getRequestURL().toString());
        String csairHost = uri.getScheme() + "://" + uri.getRawAuthority();
        model.addAttribute(CSAIR_HOST, csairHost);
        model.addAttribute("csairHost2", ucb.build());
        model.addAttribute(CURRENT_LOCALE, localeResolver.resolveLocale(request));
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result exceptonHandler(Exception e, HttpServletRequest request) {
        Locale locale = localeResolver.resolveLocale(request);
        Result result;
        if (e instanceof MailException) {
            logger.error("mail business error", e);
            MailException mailException = (MailException) e;
            result = new Result(false, mailException.getErrorCode(), mailException.getMessage(locale));
            return result;
        }
        logger.error("mail service error", e);
        result = new Result(false, SYSTEM_ERROR_CODE, messageSource.getMessage(SYSTEM_ERROR_CODE, null, locale),
                ExceptionUtils.fetchThrowableInfo(e), 0L);
        return result;
    }
}
