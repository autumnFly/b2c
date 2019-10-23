package com.csair.b2c.cloud.test.mail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelExpresstionTest extends CommonTestCode {

	ExpressionParser parser = new SpelExpressionParser();

	@Value("#{systemProperties['file.encoding']}")
	private String encoding;
	@Value("#{systemEnvironment['JAVA_HOME']}")
	private String home;
	@Value("#{localeResolver.getCookieDomain()}")
	private String domain;

	@Before
	public void session() {
	}

	@Test
	public void test() {
		System.out.println(encoding);
		System.out.println(home);
		System.out.println(domain);

		// 使用解析器解析出表达式exp
		Expression exp = parser.parseExpression("'Hello World'");
		// 在表达式中获取指定类型的值
		String value = exp.getValue(String.class);
		System.out.println(value);
	}
}
