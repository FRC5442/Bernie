package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import com.ctre.*;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem{

	TalonSRX armMotor = RobotMap.armMotor;
	@Override
	protected void initDefaultCommand() {
		
	}
	public void turn (double speed){
		armMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, .7*(speed));
	}
}
