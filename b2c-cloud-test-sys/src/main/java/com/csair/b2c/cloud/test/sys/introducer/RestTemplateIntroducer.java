package com.csair.b2c.cloud.test.sys.introducer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created on 2018/8/25.<br/>
 *
 * @author yudong
 */
@Aspect
@Component
public class RestTemplateIntroducer {
    @DeclareParents(value = "org.springframework.web.client.RestOperations+", defaultImpl = RestTemplateTime.class)
    public static RestOperationsTime restOperationsTime;
}
