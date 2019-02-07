package com.raj.design.patterns.command;

// Simple remote class that has n slots. Each slot can handle on and off of each device. slots are defined at runtime.
// This abstracts the user from actual implementation.
public class SimpleRemote {

	Command onCommands[];
	Command offCommands[];
			
	public SimpleRemote(int slots) {
		onCommands = new Command[slots];
		offCommands = new Command[slots];
	}

	public void setCommand(int slot, Command onCommand, Command offCommand)
	{
		onCommands[slot]=onCommand;
		offCommands[slot]=offCommand;
	}
	
	public void onButtonWasPushed(int slot)
	{
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot)
	{
		offCommands[slot].execute();
	}
}
