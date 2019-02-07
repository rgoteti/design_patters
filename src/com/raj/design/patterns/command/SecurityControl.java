package com.raj.design.patterns.command;

//Vendor class which implements the actual business logic/functionality to perform the operation
public class SecurityControl {

	public void arm()
	{
		System.out.println("Security control armed");
	}
	
	public void disarm()
	{
		System.out.println("Security control disarmed");
	}
}
