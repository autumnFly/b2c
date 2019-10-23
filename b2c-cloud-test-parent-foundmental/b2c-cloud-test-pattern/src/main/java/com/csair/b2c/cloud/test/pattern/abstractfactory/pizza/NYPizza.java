package com.csair.b2c.cloud.test.pattern.abstractfactory.pizza;

import com.csair.b2c.cloud.test.pattern.abstractfactory.factory.NYPizzaIngedientFactory;
import com.csair.b2c.cloud.test.pattern.abstractfactory.factory.PizzaIngedientFactory;

public class NYPizza extends FundPizza {
	PizzaIngedientFactory ingedientFactory = new NYPizzaIngedientFactory();

	@Override
	public void prepare() {
		cheese = ingedientFactory.createCheese();
		source = ingedientFactory.createSource();

	}

}
