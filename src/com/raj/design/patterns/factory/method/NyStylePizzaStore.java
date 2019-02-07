package com.raj.design.patterns.factory.method;

public class NyStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("Cheese Pizza"))
			return new NyStyleCheesePizza();
		else if(type.equals("Veggie Pizza"))
			return new NyStyleVeggiePizza();
		else if(type.equals("Pepperoni Pizza"))
			return new NyStylePepperoniPizza();
		else
			return null;
	}

}
