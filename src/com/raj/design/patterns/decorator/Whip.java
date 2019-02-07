package com.raj.design.patterns.decorator;

//Concrete decorator class
public class Whip extends CondimentDecorator{

	//Condemned accepts beverage(behavior) via composition.
	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+" , whip cream";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.10;
	}

}
