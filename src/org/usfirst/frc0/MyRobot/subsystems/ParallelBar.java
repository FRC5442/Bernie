
package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import org.usfirst.frc0.MyRobot.commands.Parallel;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ParallelBar extends Subsystem{

	Object parallelBars = RobotMap.parallelBar;
	@Override
	protected void initDefaultCommand() {
		
		setDefaultCommand(new Parallel());
	}
	public void shift(double speed){
		
	}
}
