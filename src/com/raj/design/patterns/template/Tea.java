package com.raj.design.patterns.template;

public class Tea extends CaffeineBeverage{

	@Override
	public void brew() {
		System.out.println("Steeping the Tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding leamon to tea");
	}
}
