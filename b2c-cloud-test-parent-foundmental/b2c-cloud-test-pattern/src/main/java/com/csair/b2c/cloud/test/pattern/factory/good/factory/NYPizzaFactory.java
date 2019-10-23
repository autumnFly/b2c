package com.csair.b2c.cloud.test.pattern.factory.good.factory;

import com.csair.b2c.cloud.test.pattern.factory.pizzle.NYCheesePizza;
import com.csair.b2c.cloud.test.pattern.factory.pizzle.NYFundPizza;
import com.csair.b2c.cloud.test.pattern.factory.pizzle.NYGreekPizza;
import com.csair.b2c.cloud.test.pattern.factory.pizzle.Pizza;

public class NYPizzaFactory extends SimplePizzaFactory {
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		if ("cheese".equals(type)) {
			pizza = new NYCheesePizza();
		} else if ("greek".equals(type)) {
			pizza = new NYGreekPizza();
		} else {
			pizza = new NYFundPizza();
		}
		return pizza;
	}
}
