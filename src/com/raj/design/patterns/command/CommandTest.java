package com.raj.design.patterns.command;

//Client class
public class CommandTest {

	public static void main(String[] args) {
		GarageDoor garageDoor = new GarageDoor();
		SecurityControl securityControl = new SecurityControl();
		Sprinkler sprinkler = new Sprinkler();
		Light light = new Light();
		
		GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
		GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);
		
		SecurityControlOnCommand securityControlOnCommand = new SecurityControlOnCommand(securityControl);
		SecurityControlOffCommand securityControlOffCommand = new SecurityControlOffCommand(securityControl);
		
		SprinklerOnCommand sprinklerOnCommand = new SprinklerOnCommand(sprinkler);
		SprinklerOffCommand sprinklerOffCommand = new SprinklerOffCommand(sprinkler);
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		garageDoorOnCommand.execute();
		securityControlOnCommand.execute();
		sprinklerOnCommand.execute();
		lightOnCommand.execute();
		
		System.out.println("----------------------- All On ---------------------------");
		
		garageDoorOffCommand.execute();
		securityControlOffCommand.execute();
		sprinklerOffCommand.execute();
		lightOffCommand.execute();
		
		System.out.println("----------------------- All Off ---------------------------");
	}

}
