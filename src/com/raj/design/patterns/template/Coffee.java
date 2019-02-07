package com.raj.design.patterns.template;

public class Coffee extends CaffeineBeverage{

	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Add suger and milk to coffee");
	}
}
