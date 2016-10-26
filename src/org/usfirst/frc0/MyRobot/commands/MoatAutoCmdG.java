package org.usfirst.frc0.MyRobot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class MoatAutoCmdG extends CommandGroup{
	
	public MoatAutoCmdG(){
		addSequential(new Drive_Command(15,.8));
	}

}
