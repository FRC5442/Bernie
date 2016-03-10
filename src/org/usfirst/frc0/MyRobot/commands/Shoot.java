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
		// TODO Auto-generated method stub
	
	}

	@Override
	protected void execute() {
		
		//// CHANGE FOR PRACTICE TO COMPETITION
		//latchCylinder.cylinder(true);
		//Timer.delay(2);
		//latchCylinder.cylinder(false);
		
		latchCylinder.cylinder(DoubleSolenoid.Value.kReverse);
		Timer.delay(1);
		latchCylinder.cylinder(DoubleSolenoid.Value.kForward);
		//// CHANGE FOR PRACTICE TO COMPETITION END
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
