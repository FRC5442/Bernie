package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;
import org.usfirst.frc0.MyRobot.subsystems.LatchCylinder;

import edu.wpi.first.wpilibj.DoubleSolenoid;
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
		// TODO Auto-generated method stub
		latchCylinder.cylinder(DoubleSolenoid.Value.kForward);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		latchCylinder.cylinder(DoubleSolenoid.Value.kOff);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		latchCylinder.cylinder(DoubleSolenoid.Value.kOff);
	}

}
