package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class WinchCylinder extends Subsystem{
	
	private DoubleSolenoid wCylinder = RobotMap.wCylinder;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	// To change from Practice to Competition:
	// Change "Value" rite V to Boolean. Vice versa to change back. (Yes I know that it is mispelled)
	public void wCylinder(Value position){
		wCylinder.set(position);
}
}