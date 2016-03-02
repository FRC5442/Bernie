
package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.OI;
import org.usfirst.frc0.MyRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Intaking extends Command{

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		//requires(Robot.intake);
	}

	protected void execute() {
		// TODO Auto-generated method stub
		//Robot.intake.move(OI.xboxController2.getRawAxis(5));
		Robot.intake.move(1);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.intake.move(0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.intake.move(0);
	}
}


