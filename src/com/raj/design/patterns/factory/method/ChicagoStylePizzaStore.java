package com.raj.design.patterns.factory.method;

public class ChicagoStylePizzaStore  extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("Cheese Pizza"))
			return new ChicagoStyleCheesePizza();
		else if(type.equals("Veggie Pizza"))
			return new ChicagoStyleVeggiePizza();
		else if(type.equals("Pepperoni Pizza"))
			return new ChicagoStylePepperoniPizza();
		else
			return null;
	}

}
