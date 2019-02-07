package com.raj.design.patterns.factory;

public class PizzaStore {
	Pizza pizza;
	PizzaFactory pizzaFactory;
	
	public PizzaStore(PizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}

	public Pizza orderPizza(String type)
	{
		pizza = pizzaFactory.crearePizza(type);
		pizza.bake(type);
		pizza.cut(type);
		pizza.box(type);
		return pizza;
	}
}
