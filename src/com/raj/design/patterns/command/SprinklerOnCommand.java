package com.raj.design.patterns.command;

// Command class for implementing on/off functionality. This internally calls the vendor class operation.
// 
public class SprinklerOnCommand implements Command {

	Sprinkler sprinkler;
	
	public SprinklerOnCommand(Sprinkler sprinkler) {
		this.sprinkler= sprinkler;
	}

	@Override
	public void execute() {
		sprinkler.waterOn();
	}

}
