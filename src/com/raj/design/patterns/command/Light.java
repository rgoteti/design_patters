package com.raj.design.patterns.command;

//Vendor class which implements the actual business logic/functionality to perform the operation
public class Light {

	public void on()
	{
		System.out.println("Light on");
	}
	
	public void off()
	{
		System.out.println("Light off");
	}
}
