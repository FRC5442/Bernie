/**
 * 
 */
package org.usfirst.frc0.MyRobot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * @author FIRSTMentor
 *
 */
public class AutoPort extends CommandGroup {
	
	public AutoPort(){
		// Put arm down
		addSequential(new PortArmAuto(-1));
		addSequential(new Delay_Command(1.5));
		addSequential(new PortArmAuto(0));
		// Drive forward 1.5 rot at 65% speed
		addSequential(new DriveForward(1.5, .65));
		// Put arm up
		addSequential(new PortArmAuto(1));
		addSequential(new Delay_Command(2));
		addSequential(new PortArmAuto(0));
		// Drive forward 5.6 rot at 65% speed
		addSequential(new DriveForward(5.6, .65));
	}

}
