package com.csair.b2c.cloud.test.websocket.model;

import com.csair.b2c.cloud.test.websocket.validation.DriverChecksGroup;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;

public class Driver extends Person {
	@Min(value = 18, message = "You have to be 18 to drive a car", groups = DriverChecksGroup.class)
	public int age;
	@AssertTrue(message = "You first have to pass the driving test", groups = DriverChecksGroup.class)
	public boolean hasDrivingLicense;

	public Driver() {
		super();
	}

	public Driver(String name) {
		super(name);
	}

	public Driver(int age, boolean hasDrivingLicense) {
		super();
		this.age = age;
		this.hasDrivingLicense = hasDrivingLicense;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHasDrivingLicense() {
		return hasDrivingLicense;
	}

	public void setHasDrivingLicense(boolean hasDrivingLicense) {
		this.hasDrivingLicense = hasDrivingLicense;
	}

}
