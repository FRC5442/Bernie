package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;
import org.usfirst.frc0.MyRobot.subsystems.LatchCylinder;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class SpyBoxShoot extends Command {
	private LatchCylinder latchCylinder = Robot.latchCylinder;
	@Override
	protected void initialize() {

		while (RobotMap.EncoderRight.getDistance() < 4.5){
			Robot.driveTrain.robotDrive(-.65, -.65);
			SmartDashboard.putNumber("Auto Encoder Value", RobotMap.EncoderRight.getDistance());
		}
		Robot.driveTrain.robotDrive(0, 0);
		Timer.delay(1);
		latchCylinder.cylinder(false);
		Timer.delay(1);
		latchCylinder.cylinder(true);

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
		Robot.driveTrain.robotDrive(0, 0);
	}

	@Override
	protected void interrupted() {
		Robot.driveTrain.robotDrive(0, 0);
	}

}
