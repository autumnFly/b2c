package com.csair.b2c.cloud.test.user.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <p>任何出异常的地方均记录下请求参数和异常信息</p>
 * Created on 2019/2/27.<br/>
 *
 * @author yudong
 */
@Aspect
@Component
public class LogRequestAfterErrorAop {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 拦截b2c包下所有的类下的所有方法
     */
    @Pointcut("execution(* com.csair.b2c..*(..))")
    public void point() {
    }

    // @Around("point()")
    // public Object logAfterThrowing(ProceedingJoinPoint joinPoint) throws Throwable {
    //     try {
    //         return joinPoint.proceed(joinPoint.getArgs());
    //     } catch (Throwable throwable) {
    //         String targetClazzName = joinPoint.getTarget().getClass().getCanonicalName();
    //         String targetMethodName = joinPoint.getSignature().getName();
    //         Object[] args = joinPoint.getArgs();
    //         StringBuilder stringBuilder = new StringBuilder();
    //         for (Object arg : args) {
    //             stringBuilder.append(arg.toString()).append(";");
    //         }
    //         logger.error("class:{},method:{},req params:{}", targetClazzName, targetMethodName, stringBuilder.toString(), throwable);
    //         throw throwable;
    //     }
    // }

    /**
     * 将出异常的方法的相关信息记录下来
     *
     * @param joinPoint
     * @param throwable
     */
    @AfterThrowing(value = "point()", throwing = "throwable")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable throwable) {
        String targetClazzName = joinPoint.getTarget().getClass().getCanonicalName();
        String targetMethodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        StringBuilder stringBuilder = new StringBuilder();
        for (Object arg : args) {
            stringBuilder.append(arg.toString()).append(";");
        }
        logger.error("class:{},method:{},req params:{}", targetClazzName, targetMethodName, stringBuilder.toString(), throwable);
    }
}
