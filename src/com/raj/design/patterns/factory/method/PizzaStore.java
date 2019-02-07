package com.raj.design.patterns.factory.method;

public abstract class PizzaStore {
	
	Pizza pizza;
	
	public Pizza orderPizza(String type)
	{
		pizza = createPizza(type);
		pizza.prepare(type);
		pizza.bake(type);
		pizza.cut(type);
		pizza.box(type);
		return pizza;		
	}
	
	public abstract Pizza createPizza(String type);
}
