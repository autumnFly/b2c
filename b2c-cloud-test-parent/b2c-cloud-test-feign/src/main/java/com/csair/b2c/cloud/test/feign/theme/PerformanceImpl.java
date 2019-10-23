package com.csair.b2c.cloud.test.feign.theme;

import org.springframework.stereotype.Service;

@Service
public class PerformanceImpl implements Performance {

	@Override
	public String perform(int a) {
		if (a == 1) {
			throw new RuntimeException("exception");
		}
		return "hello world,aop is a good tech.";
	}

}
