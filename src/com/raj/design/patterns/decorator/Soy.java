package com.raj.design.patterns.decorator;

//Concrete decorator class
public class Soy extends CondimentDecorator{

	//Condemned accepts beverage(behavior) via composition.
	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+" , soy";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.15;
	}

}
