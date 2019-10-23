package com.csair.b2c.cloud.test.websocket.model;

import com.csair.b2c.cloud.test.websocket.enums.CaseMode;
import com.csair.b2c.cloud.test.websocket.annotation.CheckCase;
import org.hibernate.validator.constraints.NotBlank;

public class Person {
	@NotBlank
	@CheckCase(value = CaseMode.UPPER)
	private String name;

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
