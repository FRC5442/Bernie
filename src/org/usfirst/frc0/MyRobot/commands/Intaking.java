
package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.OI;
import org.usfirst.frc0.MyRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Intaking extends Command{

	@Override
	protected void initialize() {
		//requires(Robot.intake);
	}

	protected void execute() {
		Robot.intake.move(OI.xboxController2.getRawAxis(1));
		//Robot.intake.move(1);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.intake.move(0);
	}

	@Override
	protected void interrupted() {
		Robot.intake.move(0);
	}
}


