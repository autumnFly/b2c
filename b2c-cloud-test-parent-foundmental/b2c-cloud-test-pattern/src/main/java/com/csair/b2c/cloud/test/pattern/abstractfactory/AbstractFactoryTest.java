package com.csair.b2c.cloud.test.pattern.abstractfactory;

import com.csair.b2c.cloud.test.pattern.factory.best.PizzaStore;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		PizzaStore store = new NYPizzaStore();
		store.orderPizza("cheese");
	}
}
