package com.raj.design.patterns.iterator;

import java.util.ArrayList;

public class Diner {
	public ArrayList<String> menu = new ArrayList<String>();
	
	public Diner()
	{
		addItem("Mini meal");
		addItem("Full meal");
		addItem("Veg Biryani");
		addItem("Egg Biryani");
		addItem("Chicken Biryani");
	}
	
	public void addItem(String item)
	{
		menu.add(item);
	}
	
	public DinerIterator iterator()
	{
		return new DinerIterator(menu);
	}
}
