package com.raj.design.patterns.command;

//Vendor class which implements the actual business logic/functionality to perform the operation
public class GarageDoor {
	
	public void open()
	{
		System.out.println("GarageDoor opening");
	}

	public void close()
	{
		System.out.println("GarageDoor Closing");
	}
}
