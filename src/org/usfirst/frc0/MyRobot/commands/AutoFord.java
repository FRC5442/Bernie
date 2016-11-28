package org.usfirst.frc0.MyRobot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoFord extends CommandGroup {
	public AutoFord(){
		addSequential(new Drive_Command(12, 1));
	}
}
