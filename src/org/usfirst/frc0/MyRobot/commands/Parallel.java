
package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.OI;
import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Parallel extends Command{
	//public Parallel(){
		//requires(Robot.parallelBar);
	//}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.parallelBar.move(OI.xboxController2.getRawAxis(5));
		 //Robot.parallelBar.move(1);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.parallelBar.move(0);
	}
	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.parallelBar.move(0);
	}
}


