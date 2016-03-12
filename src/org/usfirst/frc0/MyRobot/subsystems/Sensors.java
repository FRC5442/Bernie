package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Sensors extends Subsystem{
	public Encoder encoderLeft = RobotMap.EncoderLeft;
	public Encoder encoderRight = RobotMap.EncoderRight;
	public DigitalInput limitSwitch = RobotMap.limitSwitch;
	//public Ultrasonic ultrasonic = RobotMap.ultrasonic;

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
