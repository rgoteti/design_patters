package com.raj.design.patterns.state;

public class NoCoinState implements State {

	GumBallMachine gumBallMachine;
	
	public NoCoinState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertCoin() {
		
	}

	@Override
	public void turnKey() {
		System.out.println("No Coin inserted");
	}

	@Override
	public void dispenseGumBall() {
		System.out.println();
	}

	@Override
	public void returnCoin() {
		System.out.println("No Coin inserted to return");
	}

}
