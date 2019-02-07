package com.raj.design.patterns.command;

//Command class for implementing on/off functionality. This internally calls the vendor class operation.
public class LightOnCommand implements Command {

	Light light;
	
	public LightOnCommand(Light light)
	{
		this.light=light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
