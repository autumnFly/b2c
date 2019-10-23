package com.csair.b2c.cloud.test.pattern.factory.good;

import com.csair.b2c.cloud.test.pattern.factory.good.factory.SimplePizzaFactory;
import com.csair.b2c.cloud.test.pattern.factory.pizzle.Pizza;

public class PizzaStore {
	protected SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
