package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.OI;
import org.usfirst.frc0.MyRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class PortArmUpp extends Command{

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.arm.turn(OI.xboxController.getRawAxis(2));
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.arm.turn(0.0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.arm.turn(0.0);
	}
	
}
