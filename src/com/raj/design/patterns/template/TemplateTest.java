package com.raj.design.patterns.template;

public class TemplateTest {

	public static void main(String[] args) {
		CaffeineBeverage coffee = new Coffee();
		coffee.prepareRecipe();
		
		System.out.println("\n----------------------------------\n");
		CaffeineBeverage tea = new Tea();
		tea.prepareRecipe();
	}

}
