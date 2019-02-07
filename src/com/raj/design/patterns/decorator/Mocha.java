package com.raj.design.patterns.decorator;

//Concrete decorator class
public class Mocha extends CondimentDecorator{

	//Condemned accepts beverage(behavior) via composition.
	public Mocha(Beverage beverage)
	{
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" , Mocha";
	}

	@Override
	public double cost() {

		return beverage.cost()+0.20;
	}

}
