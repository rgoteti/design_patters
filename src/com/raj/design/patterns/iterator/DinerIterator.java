package com.raj.design.patterns.iterator;

import java.util.ArrayList;

public class DinerIterator implements Iterator {

	ArrayList<String> menu;
	int position;
	
	public DinerIterator(ArrayList<String> menu)
	{
		this.menu = menu;
		position = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(position<menu.size())
			return true;
		return false;
	}

	@Override
	public Object next() {
		Object obj=null;
		if(position<menu.size())
		{
			obj =  menu.get(position);
			position++;
		}
		return obj;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
