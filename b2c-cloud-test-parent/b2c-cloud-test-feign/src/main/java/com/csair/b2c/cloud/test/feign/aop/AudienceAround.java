package com.csair.b2c.cloud.test.feign.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AudienceAround {
	@Pointcut("execution(** com.csair.b2c.cloud.test.sys.controller.Performance.perform(..))")
	public void performance() {
	}

	@Around("performance()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		Object object = null;
		try {
			System.out.println("around before");
			System.out.println(joinPoint.getKind());
			System.out.println(joinPoint.getTarget());
			System.out.println(joinPoint.getThis());
			System.out.println(Arrays.toString(joinPoint.getArgs()));
			System.out.println(joinPoint.getSignature());
			System.out.println(joinPoint.getSourceLocation());
			System.out.println(joinPoint.getStaticPart());
			object = joinPoint.proceed(joinPoint.getArgs());
			System.out.println("around after");
		} catch (Throwable e) {
			System.out.println("around exception");
			throw e;
		}
		return object;
	}
}
