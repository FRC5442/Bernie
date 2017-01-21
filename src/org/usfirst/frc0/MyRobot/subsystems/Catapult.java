package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import com.ctre.*;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Catapult extends Subsystem{

	CANTalon winchMotor = (CANTalon) RobotMap.winchMotor;
	@Override
	protected void initDefaultCommand() {
		
	}
	public void move(double speed){
		winchMotor.set(speed);
	}
}
