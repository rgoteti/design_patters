package com.raj.design.patterns.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		
		//we are defining the fly behavior and quack behavior at runtime.
		//we can change the fly strategy or quack strategy at run time.
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.dispaly();
		mallardDuck.performFly();
		mallardDuck.performQuak();
		mallardDuck.swim();
		
		System.out.println("\n\n");
		
		//we are defining the fly behavior and quack behavior at runtime.
		//we can change the fly strategy or quack strategy at run time.
		RubberDuck rubberDuck = new RubberDuck();
		//This can be set in RubberDuck constructor as done for MallardDuck. This is the preferred way.
		rubberDuck.setFlyBehaviour(new NoFly());
		rubberDuck.setQuakBehaviour(new SqueakClass());
		rubberDuck.dispaly();
		rubberDuck.performFly();
		rubberDuck.performQuak();
		rubberDuck.swim();
		
	}

}
