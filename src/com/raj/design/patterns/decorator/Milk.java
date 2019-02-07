package com.raj.design.patterns.decorator;

// Concrete decorator class
public class Milk extends CondimentDecorator{

	//Condemned accepts beverage(behavior) via composition.
	public Milk(Beverage beverage)
	{
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" , Steamed Milk";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.10;
	}

}
