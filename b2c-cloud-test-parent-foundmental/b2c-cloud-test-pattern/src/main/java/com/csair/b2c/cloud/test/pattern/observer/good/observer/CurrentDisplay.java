package com.csair.b2c.cloud.test.pattern.observer.good.observer;

import com.csair.b2c.cloud.test.pattern.observer.good.Observer;
import com.csair.b2c.cloud.test.pattern.observer.good.Subject;

public class CurrentDisplay implements Observer {

	private Subject subject;

	public CurrentDisplay(Subject subject) {
		this.subject = subject;
	}

	public void update(int temperature, int humidity, int pressure) {
		System.out.println("CurrentDisplay:" + temperature);
	}

	public Subject getSubject() {
		return subject;
	}

}
