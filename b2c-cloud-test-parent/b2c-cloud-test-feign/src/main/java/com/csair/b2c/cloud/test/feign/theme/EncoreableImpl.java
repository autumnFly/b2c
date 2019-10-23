package com.csair.b2c.cloud.test.feign.theme;

public class EncoreableImpl implements Encoreable {

	@Override
	public String performEncore() {
		System.out.println("new method for a bean");
		return "new method";
	}

}
