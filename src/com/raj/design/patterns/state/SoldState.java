package com.raj.design.patterns.state;

public class SoldState implements State {

	GumBallMachine gumBallMachine;
	
	public SoldState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnKey() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispenseGumBall() {
		// TODO Auto-generated method stub

	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub

	}

}
