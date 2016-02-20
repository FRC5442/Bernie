package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class WinchCylinder extends Subsystem{
	
	private DoubleSolenoid wCylinder = RobotMap.wCylinder;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void wCylinder(DoubleSolenoid.Value position){
		wCylinder.set(position);
}
}