package com.raj.design.patterns.factory;

public class PizzaFactory {
	public Pizza crearePizza(String type)
	{
		if(type.equals("Cheese Pizza"))
			return new CheesePizza();
		else if(type.equals("Veggie Pizza"))
			return new VeggiePizza();
		else if(type.equals("Pepperoni Pizza"))
			return new PepperoniPizza();
		else
			return null;
					
	}
}
