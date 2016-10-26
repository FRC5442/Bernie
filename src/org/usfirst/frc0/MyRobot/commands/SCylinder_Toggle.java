/**
 * 
 */
package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.subsystems.LatchCylinder;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author FIRSTMentor
 *
 */
public class SCylinder_Toggle extends Command {
	

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		LatchCylinder.cylinder(true);
		Timer.delay(.25);

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void end() {
		LatchCylinder.cylinder(false);

	}
	
	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
