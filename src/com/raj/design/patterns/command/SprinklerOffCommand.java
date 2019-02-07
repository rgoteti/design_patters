package com.raj.design.patterns.command;

//Command class for implementing on/off functionality. This internally calls the vendor class operation.
public class SprinklerOffCommand implements Command {

	Sprinkler sprinkler;
	
	public SprinklerOffCommand(Sprinkler sprinkler) {
		this.sprinkler= sprinkler;
	}

	@Override
	public void execute() {
		sprinkler.waterOff();		
	}

}
