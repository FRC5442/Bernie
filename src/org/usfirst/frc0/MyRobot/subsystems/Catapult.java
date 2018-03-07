package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;
import com.ctre.*;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Catapult extends Subsystem{

	TalonSRX winchMotor = RobotMap.winchMotor;
	@Override
	protected void initDefaultCommand() {
		
	}
	public void move(double speed){
		winchMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 1*(speed));
	}
}
