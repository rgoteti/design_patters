package com.raj.design.patterns.command;

//Command class for implementing on/off functionality. This internally calls the vendor class operation.
public class GarageDoorOffCommand implements Command {

	GarageDoor garageDoor;
	public GarageDoorOffCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.close();
	}

}
