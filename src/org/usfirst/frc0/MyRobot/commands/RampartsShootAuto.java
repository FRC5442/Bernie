package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;
import org.usfirst.frc0.MyRobot.subsystems.LatchCylinder;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RampartsShootAuto extends Command{
	
	private LatchCylinder latchCylinder = Robot.latchCylinder;
	
	public RampartsShootAuto(){
		requires(latchCylinder);
	}

	@Override
	protected void initialize() {
		while(RobotMap.EncoderRight.getDistance() <= 16){
			org.usfirst.frc0.MyRobot.Robot.driveTrain.robotDrive(-.65, -.65);
			SmartDashboard.putNumber("Auto Encoder Value", RobotMap.EncoderRight.getDistance());
		}
		Robot.driveTrain.robotDrive(0, 0);
		//if (Robot.sensors.armEncoder.getDistance() < 12){
			//latchCylinder.cylinder(true);
		//Timer.delay(2);
		//latchCylinder.cylinder(false);
		//}
		
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
		while(RobotMap.limitSwitch.get() == false){
			Robot.winchCylinder.wCylinder(true);
			Timer.delay(.5);
			RobotMap.winchMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 1);
			
		}
		Timer.delay(.5);
		RobotMap.winchMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 0);
		Timer.delay(.25);
		Robot.winchCylinder.wCylinder(false);
		
	}

	@Override
	protected void interrupted() {
		
	}

}
