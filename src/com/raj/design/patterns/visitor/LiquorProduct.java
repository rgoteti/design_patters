package com.raj.design.patterns.visitor;

public class LiquorProduct implements Visitable {
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

	public LiquorProduct(int price) {
		this.price = price;
	}
}
