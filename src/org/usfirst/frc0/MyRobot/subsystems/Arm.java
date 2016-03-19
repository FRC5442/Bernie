package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem{

	CANTalon armMotor = RobotMap.armMotor;
	@Override
	protected void initDefaultCommand() {
		
	}
	public void turn (double speed){
		armMotor.set((speed));
	}
}
