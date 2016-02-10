package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class LowBarAuto extends Command {

	@Override
	protected void initialize() {
		//org.usfirst.frc0.MyRobot.Robot.sensors.encoderLeft.reset();
		//org.usfirst.frc0.MyRobot.Robot.sensors.encoderRight.reset();
		//RobotMap.EncoderLeft.reset();
		//RobotMap.EncoderRight.reset();
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		while(-1 * (RobotMap.EncoderLeft.getDistance()) <= 5.3){
			org.usfirst.frc0.MyRobot.Robot.driveTrain.robotDrive(.65, .65);
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
