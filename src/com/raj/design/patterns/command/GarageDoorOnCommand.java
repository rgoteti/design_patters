package com.raj.design.patterns.command;

//Command class for implementing on/off functionality. This internally calls the vendor class operation.
public class GarageDoorOnCommand implements Command {

	GarageDoor garageDoor;
	public GarageDoorOnCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.open();
	}

}
