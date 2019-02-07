package com.raj.design.patterns.state;

public class GumBallMachine {

	State soldOutState;
	State hasCoinState;
	State noCoinState;
	State soldState;
	
	State state;
	int count;	
	
	public GumBallMachine(int count) {
		this.count = count;
		soldOutState = new SoldOutState(this);
		hasCoinState = new HasCoinState(this);
		noCoinState = new NoCoinState(this);
		soldState = new SoldState(this);
	}
	
	public void setState(State state)
	{
		this.state=state;
	}
	
	public void insertCoin()
	{
		state.insertCoin();
	}
	public void turnKey()
	{
		state.turnKey();
		dispenseGumBall();
	}
	
	public void dispenseGumBall()
	{
		state.dispenseGumBall();
	}
	public void returnCoin()
	{
		state.returnCoin();
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getHasCoinState() {
		return hasCoinState;
	}
	
	public State getNoCoinState() {
		return noCoinState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getState() {
		return state;
	}
	
	public int getCount() {
		return count;
	}
}
