package com.raj.design.patterns.state;

public class SoldOutState implements State {

	GumBallMachine gumBallMachine;
	
	public SoldOutState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertCoin() {
		System.out.println("Cannot accept coin, GumBalls soldout");
	}

	@Override
	public void turnKey() {
		System.out.println("No Coin inserted");
	}

	@Override
	public void dispenseGumBall() {
		System.out.println("Soldout cannot dispense");
	}

	@Override
	public void returnCoin() {
		System.out.println("No Coin inserted");
	}

}
