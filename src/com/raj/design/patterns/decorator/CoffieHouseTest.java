package com.raj.design.patterns.decorator;

public class CoffieHouseTest {
	public static void main(String[] args) {
		// Order: I want a DarkRoast coffee with double mocha 
		// A dark roast coffee is decorated with 2 shots of mocha
		Beverage beverage = new Mocha(new Mocha(new DarkRoast()));
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());

		//Order: I want a DarkRoast coffee with mocha and whip cream.
		// A dark roast coffee is decorated with one shot mocha and whip cream
		Beverage beverage1 = new Whip(new Mocha(new DarkRoast()));
		System.out.println(beverage1.getDescription());
		System.out.println(beverage1.cost());
		
		/*
		 * Key Points
		 * Decorators have the same supertype as the objects they decorate.
		 * 
		 * You can use one or more decorators to wrap an object.
		 *  
		 * Given that the decorator has the same supertype as the object it decorates, we can pass
		 * around a decorated object in place of the original (wrapped) object. 
		 * 
		 * The decorator adds its own behavior either before and/or after delegating to the
		 * object it decorates to do the rest of the job. 
		 * 
		 * Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many
		 * decorators as we like
		 */
	}
}
