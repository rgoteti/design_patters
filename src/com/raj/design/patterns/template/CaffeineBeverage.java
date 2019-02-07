package com.raj.design.patterns.template;

public abstract class CaffeineBeverage {
	
	//This method is the Template method. 
	// Template method defines a algorithm and lets subclass define certain steps in the algorithm.
	// In this case prepareRecipe is the algo brew and addcondiments are steps that subclasses define.
	// To prevent the subclasses from changing the algorithm we define prepareRecipe as final.
	// Template method follows hollywood principle, don't call us we will call you.
	// The hollywood principle guides us to put decision making in high level modules that can decide how and when to call low level modules.
	// The strategy and template both encapsulate algorithms. Strategy does this by composition, template does it by inheritance.
	public final void prepareRecipe()
	{
		boilWater();
		brew();
		pourBeverageIntoCup();
		addCondiments();
		//This method is called hook method. Subclasses can override it or ignore it based on need.
		//
		hook();
	}
	
	private void hook() {
	}

	public void boilWater()
	{
		System.out.println("Boiling water for Beverage");
	}
	
	public void pourBeverageIntoCup()
	{
		System.out.println("Pour Beverage Into Cup");
	}
	
	public abstract void brew();
	public abstract void addCondiments();
}
