package com.raj.design.patterns.factory;

public class Pizza {

	public void bake(String type)
	{
		System.out.println("Baking "+type);
	}
	
	public void cut(String type)
	{
		System.out.println("Cutting "+type);
	}
	
	public void box(String type)
	{
		System.out.println("Boxing "+type);
	}
}
