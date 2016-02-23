package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.OI;
import org.usfirst.frc0.MyRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class BarsOut extends Command{

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(Robot.parallelBars);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		while(OI.xboxController2.getRawAxis(2) > 0.1){
			Robot.parallelBars.shift(-1*(OI.xboxController2.getRawAxis(2)));
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
