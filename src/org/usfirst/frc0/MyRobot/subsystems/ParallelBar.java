
package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import org.usfirst.frc0.MyRobot.commands.Parallel;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ParallelBar extends Subsystem{

	Talon parallelBar = RobotMap.intake;
	@Override
	protected void initDefaultCommand() {
		
		//setDefaultCommand(new Parallel());
	}
	public void move(double speed){
		//parallelBar.set(.5 *(speed));
		parallelBar.set(speed);
	}
}
