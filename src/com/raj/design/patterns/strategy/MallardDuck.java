package com.raj.design.patterns.strategy;

public class MallardDuck extends Duck{

	public MallardDuck()
	{
		// This can be set using setFlyBehaviour and setQuakBehaviour in main class as done for RubberDuck
		// Defining fly and quack behavior for mallard duck at runtime. 
		flyBehaviour = new FlyWithWings();
		quakBehaviour = new QuakClass();
	}
	
	public void dispaly()
	{
		System.out.println("Display Mallerd Duck");
	}
}
