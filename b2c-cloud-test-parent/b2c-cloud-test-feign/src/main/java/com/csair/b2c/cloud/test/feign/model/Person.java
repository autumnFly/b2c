package com.csair.b2c.cloud.test.feign.model;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -3056805657617014112L;
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
