package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ParallelBars extends Subsystem{

	SpeedController parallelBars = RobotMap.parallelBar;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void shift(double speed){
		parallelBars.set(speed);
	}
}
