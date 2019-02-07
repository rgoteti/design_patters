package com.raj.design.patterns.command;

//Command class for implementing on/off functionality. This internally calls the vendor class operation.
public class SecurityControlOnCommand implements Command {

	SecurityControl securityControl;
	public SecurityControlOnCommand(SecurityControl securityControl) {
		this.securityControl =securityControl; 
	}

	@Override
	public void execute() {
		securityControl.arm();

	}

}
