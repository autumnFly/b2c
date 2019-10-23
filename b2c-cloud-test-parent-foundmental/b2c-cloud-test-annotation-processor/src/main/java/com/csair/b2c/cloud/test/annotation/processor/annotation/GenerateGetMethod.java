package com.csair.b2c.cloud.test.annotation.processor.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 2019/1/12.<br/>
 *
 * @author yudong
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface GenerateGetMethod {
}
