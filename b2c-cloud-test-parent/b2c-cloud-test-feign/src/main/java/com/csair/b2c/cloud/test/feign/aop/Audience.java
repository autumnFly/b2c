package com.csair.b2c.cloud.test.feign.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
// @Component
public class Audience {
	@Pointcut("execution(** com.csair.b2c.cloud.test.feign.theme.Performance.perform(..))")
	public void performance() {
	};

	@Before("performance()")
	public void before() {
		System.out.println("before");
	}

	@After("performance()")
	public void after() {
		System.out.println("after");
	}

	@AfterReturning("performance()")
	public void afterReturning() {
		System.out.println("after returning");
	}

	@AfterThrowing("performance()")
	public void AfterThrowing() {
		System.out.println("After throwing");
	}
}
