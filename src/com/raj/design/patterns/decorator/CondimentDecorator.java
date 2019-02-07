package com.raj.design.patterns.decorator;

//Abstract decorator class. This inherits from Beverage base class. This acts as base class for all derived decorator classes
// Here we use Inheritance to obtain type matching but use composition to obtain behavior. 
// This has a reference to Beverage, for decorating additional behavior from concrete Beverage implementations.
public abstract class CondimentDecorator extends Beverage{

	Beverage beverage;
}
