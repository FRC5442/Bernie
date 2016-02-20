package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class LatchCylinder extends Subsystem{

	private DoubleSolenoid cylinder = RobotMap.cylinder;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void cylinder(DoubleSolenoid.Value position){
		cylinder.set(position);
	}
}
