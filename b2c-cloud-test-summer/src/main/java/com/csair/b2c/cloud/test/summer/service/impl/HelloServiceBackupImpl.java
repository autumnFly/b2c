package com.csair.b2c.cloud.test.summer.service.impl;

import com.csair.b2c.cloud.test.summer.service.HelloService;
import org.summerframework.summer.core.anno.SummerAutowired;
import org.summerframework.summer.core.anno.SummerService;
import org.summerframework.summer.core.ioc.SummerApplicationContext;
import org.summerframework.summer.core.ioc.SummerApplicationContextAware;
import org.summerframework.summer.core.ioc.SummerBeanNameAware;
import org.summerframework.summer.core.ioc.SummerInitializingBean;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

/**
 * @author yudong
 * @date 2019/5/13
 */
@SummerService
public class HelloServiceBackupImpl implements HelloService {

    @Override
    public String sayHello() {
        return "welcome to java";
    }

}
