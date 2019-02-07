package com.raj.design.patterns.decorator;

//Concrete implementation on Beverage base class
public class DarkRoast extends Beverage{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "DorkRoast coffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.99;
	}

}
