package com.csair.b2c.cloud.test.pattern.factory.good.factory;

import com.csair.b2c.cloud.test.pattern.factory.pizzle.CheesePizza;
import com.csair.b2c.cloud.test.pattern.factory.pizzle.FundPizza;
import com.csair.b2c.cloud.test.pattern.factory.pizzle.GreekPizza;
import com.csair.b2c.cloud.test.pattern.factory.pizzle.Pizza;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		FundPizza pizza;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("greek".equals(type)) {
			pizza = new GreekPizza();
		} else {
			pizza = new FundPizza();
		}
		return pizza;
	}
}
