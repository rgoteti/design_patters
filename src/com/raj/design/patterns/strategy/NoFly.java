package com.raj.design.patterns.strategy;

public class NoFly implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Cannot Fly");
	}

}
