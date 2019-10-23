package com.csair.b2c.cloud.test.sys.aop;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 记录RestTemplate调用接口的耗时<br/>
 * Created on 2018/8/17.<br/>
 *
 * @author yudong
 */
@Aspect
@Component
public class RestTemplateLog {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(* org.springframework.web.client.RestTemplate.*(..))")
    public void point() {
    }

    @Pointcut("bean(jedisCluster)")
    public void method() {
    }

    @Around("point()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("req:{}", JSONObject.toJSONString(joinPoint.getArgs()));
        long startTime = System.currentTimeMillis();
        Object object = joinPoint.proceed(joinPoint.getArgs());
        logger.info("res:{}", JSONObject.toJSONString(object));
        logger.info("comsume time:{}ms", System.currentTimeMillis() - startTime);
        return object;
    }

    @Around("method()")
    public Object logMethodName(ProceedingJoinPoint joinPoint) throws Throwable {
        Object object = joinPoint.proceed(joinPoint.getArgs());
        logger.info("method name:{}", joinPoint.getSignature().getName());
        return object;
    }

}
