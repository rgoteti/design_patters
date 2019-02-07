package com.raj.design.patterns.visitor;

public class TobacoProduct implements Visitable{
	int price;

	@Override
	public double accept(Visitor v) {
		return v.visit(this);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public TobacoProduct(int price) {
		this.price = price;
	}
}
