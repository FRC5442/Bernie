package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem{
	SpeedController intakeRoller = RobotMap.intakeRoller;
	//SpeedController parallelBar = RobotMap.parallelBar;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}   
	public void move (double speed) {
		// TODO Auto-generated method stub
		intakeRoller.set(speed);
		//parallelBar.set(speed);
	}
}
