package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem{
	Talon intake = RobotMap.intakeRoller;
	//SpeedController parallelBar = RobotMap.parallelBar;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}   
	public void move (double speed) {
		// TODO Auto-generated method stub
		intake.set(1*(speed));
		//parallelBar.set(speed);
	}
}
