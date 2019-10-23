package com.csair.com.cloud.test.boot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 在Spring里可以很方便地编写你自己的条件，你所要做的就是实现Condition接口，覆盖它 的matches()
 * 方法。举例来说，下面这个简单的条件类只有在dev激活时 才会生效
 * 
 * @author yudong
 * 
 */
public class LogbackEnvPropsCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return context.getEnvironment().acceptsProfiles("dev");
	}
}
