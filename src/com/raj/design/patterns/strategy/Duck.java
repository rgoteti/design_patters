package com.raj.design.patterns.strategy;

public abstract class Duck {

	// Fly and quack behavior changes for different type of Duck, so separated it out from Duck class.
	// Interface for plugging in the behavior at runtime.
	// decide which fly strategy and quack strategy to follow at runtime	
	FlyBehaviour flyBehaviour = null;
	QuakBehaviour quakBehaviour = null;
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void dispaly();	

	//Fly Behavior setter 
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	//quack Behavior setter
	public void setQuakBehaviour(QuakBehaviour quakBehaviour) {
		this.quakBehaviour = quakBehaviour;
	}

	//actual method call for performing fly
	public void performFly()
	{
		flyBehaviour.fly();
	}
	
	//actual method call for performing quack
	public void performQuak()
	{
		quakBehaviour.quak();
	}
	
	public void swim()
	{
		System.out.println("Every Duck swims the same way");
	}
}
