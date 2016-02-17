package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem{
	SpeedController intakeController = RobotMap.intakeController;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}   
	private void move (double speed) {
		// TODO Auto-generated method stub
		intakeController.set(speed);
	}

}
