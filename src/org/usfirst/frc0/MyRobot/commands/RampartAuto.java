package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RampartAuto extends Command {

	@Override
	protected void initialize() {
		while(RobotMap.EncoderRight.getDistance() <= 13){
			org.usfirst.frc0.MyRobot.Robot.driveTrain.robotDrive(-.65, -.65);
			SmartDashboard.putNumber("Auto Encoder Value", RobotMap.EncoderRight.getDistance());
		}
		Robot.driveTrain.robotDrive(0, 0);
	}

	@Override
	protected void execute() {
		
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		
	}

	@Override
	protected void interrupted() {
		Robot.driveTrain.robotDrive(0, 0);
	}

}
