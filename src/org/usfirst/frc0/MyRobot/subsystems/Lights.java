package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lights extends Subsystem{

	DoubleSolenoid Light = RobotMap.light;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
