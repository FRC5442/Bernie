package org.usfirst.frc0.MyRobot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;
import edu.wpi.first.wpilibj.Timer;

public class MoatAuto extends Command {

	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		while(-1 * (RobotMap.EncoderRight.getDistance()) <= 15){
			org.usfirst.frc0.MyRobot.Robot.driveTrain.robotDrive(.8, .8);
		}
		Timer.delay(1);
		//Robot.driveTrain.robotDrive(-.3, -.3);
		Robot.driveTrain.robotDrive(0, 0);
		
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.driveTrain.robotDrive(0, 0);

	}

	@Override
	protected void interrupted() {
		Robot.driveTrain.robotDrive(0, 0);

	}

}
