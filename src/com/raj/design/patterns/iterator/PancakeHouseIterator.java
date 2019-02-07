package com.raj.design.patterns.iterator;

public class PancakeHouseIterator implements Iterator {

	public String[] menu;
	int position;
	
	public PancakeHouseIterator(String[] menu)
	{
		this.menu =  menu;
		position=0;
	}
	
	@Override
	public boolean hasNext() {
		if(position<menu.length)
			return true;
		return false;
	}

	@Override
	public Object next() {
		Object obj=null;
		if(position<menu.length)
		{
			obj =  menu[position];
			position++;
		}
		return obj;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
