package com.raj.design.patterns.decorator;

//Concrete implementation on Beverage base class
public class Decaf extends Beverage{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Decaf";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}
