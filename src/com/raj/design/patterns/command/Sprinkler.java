package com.raj.design.patterns.command;

//Vendor class which implements the actual business logic/functionality to perform the operation
public class Sprinkler {
	
	public void waterOn()
	{
		System.out.println("sprinkler on");
	}

	public void waterOff()
	{
		System.out.println("sprinkler off");
	}
}
