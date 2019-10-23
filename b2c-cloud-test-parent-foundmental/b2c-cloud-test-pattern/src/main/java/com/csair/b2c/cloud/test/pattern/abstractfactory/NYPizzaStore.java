package com.csair.b2c.cloud.test.pattern.abstractfactory;

import com.csair.b2c.cloud.test.pattern.abstractfactory.pizza.NYPizza;
import com.csair.b2c.cloud.test.pattern.factory.best.PizzaStore;
import com.csair.b2c.cloud.test.pattern.factory.good.factory.NYPizzaFactory;
import com.csair.b2c.cloud.test.pattern.factory.good.factory.SimplePizzaFactory;
import com.csair.b2c.cloud.test.pattern.factory.pizzle.Pizza;

public class NYPizzaStore extends PizzaStore {
	SimplePizzaFactory factory = new NYPizzaFactory();

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = new NYPizza();
		return pizza;
	}
}
