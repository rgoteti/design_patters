package com.raj.design.patterns.factory;

public class PizzaStoreTest {

	public static void main(String[] args) {
		PizzaFactory factory = new PizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		System.out.println(pizzaStore.orderPizza("Veggie Pizza"));
	}

}
