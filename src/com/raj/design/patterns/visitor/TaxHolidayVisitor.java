package com.raj.design.patterns.visitor;

public class TaxHolidayVisitor implements Visitor{

	/*
	 * LiquorProducts are taxed at 5% 
	 * 
	 */
	@Override
	public double visit(LiquorProduct liquorProduct) {
		double price = liquorProduct.getPrice() + (liquorProduct.getPrice()*0.05);
		return price;
	}

	/*
	 * TobacoProducts are taxed at 10% 
	 * 
	 */
	@Override
	public double visit(TobacoProduct tobacoProduct) {
		double price = tobacoProduct.getPrice() + (tobacoProduct.getPrice()*0.10);
		return price;
	}

	/*
	 * NecessityProducts are taxed at 0% 
	 * 
	 */
	@Override
	public double visit(NecessityProduct necessityProduct) {
		double price = necessityProduct.getPrice() + (necessityProduct.getPrice()*0.0);
		return price;
	}

}
