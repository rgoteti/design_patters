package com.raj.design.patterns.iterator;

public class PancakeHouse {
	public String[] menu = new String[5];
	
	public PancakeHouse()
	{
		addItem(0,"Plain Dosa");
		addItem(1,"Butter Dosa");
		addItem(2,"Rava Dosa");
		addItem(3,"Masala Dosa");
		addItem(4,"Upma Dosa");
	}
	
	public void addItem(int index, String item)
	{
		menu[index] =  item;
	}
	
	public PancakeHouseIterator iterator()
	{
		return new PancakeHouseIterator(menu);
	}
}
