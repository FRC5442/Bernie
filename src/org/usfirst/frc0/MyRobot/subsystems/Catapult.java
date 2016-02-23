package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

public class Catapult extends Subsystem{
	private CANTalon catapultWinch = RobotMap.winchMotor;	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void wrap(double speed) {
		// TODO Auto-generated method stub
		catapultWinch.set(speed);
	}

}
