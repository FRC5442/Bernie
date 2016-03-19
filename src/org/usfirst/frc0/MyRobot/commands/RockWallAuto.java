package org.usfirst.frc0.MyRobot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;
import edu.wpi.first.wpilibj.Timer;

public class RockWallAuto extends Command{

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		//while(-1 * (RobotMap.EncoderLeft.getDistance()) <= 15);{
			Robot.driveTrain.robotDrive(.8, .8);
		//}
		//Timer.delay(1);
		//Robot.driveTrain.robotDrive(0,0);
	}

	@Override
	protected boolean isFinished() {
		return RobotMap.EncoderLeft.getDistance() <= 15;
	}

	@Override
	protected void end() {
		Robot.driveTrain.robotDrive(0, 0);
	}

	@Override
	protected void interrupted() {
		
	}

}
