package com.raj.design.patterns.visitor;

public class TaxVisitor implements Visitor {

	/*
	 * LiquorProducts are taxed at 18% 
	 * 
	 */
	@Override
	public double visit(LiquorProduct liquorProduct) {
		double price = liquorProduct.getPrice() + (liquorProduct.getPrice()*0.18);
		return price;
	}

	/*
	 * TobacoProducts are taxed at 30% rate
	 * 
	 */
	@Override
	public double visit(TobacoProduct tobacoProduct) {
		double price = tobacoProduct.getPrice() + (tobacoProduct.getPrice()*0.30);
		return price;
	}

	/*
	 * NecessityProducts are taxed at 5% rate
	 * 
	 */
	@Override
	public double visit(NecessityProduct necessityProduct) {
		double price = necessityProduct.getPrice() + (necessityProduct.getPrice()*0.05);
		return price;
	}

}
