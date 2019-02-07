package com.raj.design.patterns.visitor;

public interface Visitor {

	public double visit(LiquorProduct liquorProduct);
	public double visit(TobacoProduct tobacoProduct);
	public double visit(NecessityProduct necessityProduct);
}
