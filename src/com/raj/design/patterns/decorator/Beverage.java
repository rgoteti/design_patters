package com.raj.design.patterns.decorator;

// This is the abstract base class from which all classes inherit
// This can as well be a interface.
public abstract class Beverage {

	String decsription;
	
	public abstract String getDescription();
	
	public abstract double cost();
	
}
