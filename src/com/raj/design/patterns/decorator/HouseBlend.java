package com.raj.design.patterns.decorator;

//Concrete implementation on Beverage base class
public class HouseBlend extends Beverage{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "HouseBlend coffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

}
