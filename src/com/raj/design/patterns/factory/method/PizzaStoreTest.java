package com.raj.design.patterns.factory.method;

public class PizzaStoreTest {

	public static void main(String[] args) {
		PizzaStore nyStyle = new NyStylePizzaStore();
		System.out.println(nyStyle.orderPizza("Cheese Pizza"));
		
		System.out.println("------------------------------------");
		PizzaStore checagoStyle = new ChicagoStylePizzaStore();
		System.out.println(checagoStyle.orderPizza("Cheese Pizza"));
	}

}
