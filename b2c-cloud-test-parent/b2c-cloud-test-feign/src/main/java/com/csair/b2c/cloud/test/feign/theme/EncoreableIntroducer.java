package com.csair.b2c.cloud.test.feign.theme;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EncoreableIntroducer {
	/**
	 * Performance后面的+号表示其所有的子类型,而不是Performance本身
	 */
	@DeclareParents(value = "com.csair.b2c.cloud.test.feign.theme.Performance+", defaultImpl = EncoreableImpl.class)
	public static Encoreable encoreable;// 要引入的接口
}
