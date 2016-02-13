package org.usfirst.frc0.MyRobot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;
import edu.wpi.first.wpilibj.Timer;

public class MoatAuto extends Command {

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		while(-1 * (RobotMap.EncoderRight.getDistance()) <= 5.3){
			org.usfirst.frc0.MyRobot.Robot.driveTrain.robotDrive(.8, .8);
		}
		Timer.delay(1);
		//Robot.driveTrain.robotDrive(-.3, -.3);
		Robot.driveTrain.robotDrive(0, 0);
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.driveTrain.robotDrive(0, 0);

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.driveTrain.robotDrive(0, 0);

	}

}
