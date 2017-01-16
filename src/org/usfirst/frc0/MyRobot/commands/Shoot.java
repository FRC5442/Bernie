package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;
import org.usfirst.frc0.MyRobot.subsystems.LatchCylinder;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shoot extends Command{

	private LatchCylinder latchCylinder = Robot.latchCylinder;
	
	public Shoot(){
		requires(latchCylinder);
	}
	@Override
	protected void initialize() {
		//// CHANGE FOR PRACTICE TO COMPETITION DONE DONE DONE DOOOONNNEE
		//////////////////////// CHANGE DURING COMP: NEED TO FIND RIGHT ENCODERS
		//if (Robot.sensors.armEncoder.getDistance() < 12){
		//	latchCylinder.cylinder(true);
		//Timer.delay(2);
		//latchCylinder.cylinder(false);
		LatchCylinder.cylinder(true);
		Timer.delay(.5);
		LatchCylinder.cylinder(false);
		
		
		//latchCylinder.cylinder(DoubleSolenoid.Value.kReverse);
		//Timer.delay(1);
		//latchCylinder.cylinder(DoubleSolenoid.Value.kForward);
		//// CHANGE FOR PRACTICE TO COMPETITION END
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
			//RobotMap.winchMotor.set(1);
			
		}
		Timer.delay(.5);
		//RobotMap.winchMotor.set(0);
		Timer.delay(.25);
		Robot.winchCylinder.wCylinder(false);
		
	}

	@Override
	protected void interrupted() {
		
	}

}
