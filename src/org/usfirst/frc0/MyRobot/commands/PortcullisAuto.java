
package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class PortcullisAuto extends Command{

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(Robot.arm);
		RobotMap.EncoderLeft.reset();
		RobotMap.EncoderRight.reset();
	}

	@Override
	protected void execute() {
	Robot.arm.turn(-1);
	Timer.delay(3);
	Robot.arm.turn(0);
	while(RobotMap.EncoderLeft.getDistance() < 1.5){
		org.usfirst.frc0.MyRobot.Robot.driveTrain.robotDrive(.65, .65);
	}
	//move approx 5'to reach 
	org.usfirst.frc0.MyRobot.Robot.driveTrain.robotDrive(0, 0);
	Robot.arm.turn(1);
	Timer.delay(2);
	Robot.arm.turn(0);
	while(RobotMap.EncoderLeft.getDistance() < 5.6){
		org.usfirst.frc0.MyRobot.Robot.driveTrain.robotDrive(.65, .65);
	}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		org.usfirst.frc0.MyRobot.Robot.driveTrain.robotDrive(0, 0);
		Robot.arm.turn(0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		org.usfirst.frc0.MyRobot.Robot.driveTrain.robotDrive(0, 0);
		Robot.arm.turn(0);
	}

}
