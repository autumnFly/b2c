package com.csair.b2c.cloud.test.annotation.processor.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 2019/1/10.<br/>
 *
 * @author yudong
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
public @interface EmptyNoAllow {

    String value() default "";

    Class<? extends Exception> exception() default Exception.class;
}
