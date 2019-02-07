package com.raj.design.patterns.iterator;

public class IteratorTest {

	public static void main(String[] args) {
		PancakeHouse pancakeHouse = new PancakeHouse();
		Diner diner = new Diner();
		
		Iterator pancakeIterator = pancakeHouse.iterator();
		print(pancakeIterator);

		Iterator dinerIterator = diner.iterator();
		print(dinerIterator);
	}

	private static void print(Iterator iterator) {
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
