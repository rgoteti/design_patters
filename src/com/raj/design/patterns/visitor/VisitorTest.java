package com.raj.design.patterns.visitor;

public class VisitorTest {

	public static void main()
	{
		TaxVisitor taxVisitor = new TaxVisitor();
		System.out.println(""+new NecessityProduct(45).accept(taxVisitor));
		System.out.println(""+new LiquorProduct(100).accept(taxVisitor));
		System.out.println(""+new TobacoProduct(50).accept(taxVisitor));
		
		
		TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();
		System.out.println(""+new NecessityProduct(45).accept(taxHolidayVisitor));
		System.out.println(""+new LiquorProduct(100).accept(taxHolidayVisitor));
		System.out.println(""+new TobacoProduct(50).accept(taxHolidayVisitor));
	}
}
