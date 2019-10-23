package com.csair.b2c.cloud.test.pattern.abstractfactory.factory;

import com.csair.b2c.cloud.test.pattern.abstractfactory.ingedient.Cheese;
import com.csair.b2c.cloud.test.pattern.abstractfactory.ingedient.NYCheese;
import com.csair.b2c.cloud.test.pattern.abstractfactory.ingedient.NYSource;
import com.csair.b2c.cloud.test.pattern.abstractfactory.ingedient.Source;

public class NYPizzaIngedientFactory implements PizzaIngedientFactory {
	public Source createSource() {
		return new NYSource();
	};

	public Cheese createCheese() {
		return new NYCheese();
	};
}
