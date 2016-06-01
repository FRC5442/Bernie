/**
 * 
 */
package org.usfirst.frc0.MyRobot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * @author FIRSTMentor
 *
 */
public class AutoStraightShootCmdG extends CommandGroup {
	public AutoStraightShootCmdG(){
		addSequential(new Drive_Command(16,.65));
		//addSequential(new Timer_Sleep(2));
	}

}
