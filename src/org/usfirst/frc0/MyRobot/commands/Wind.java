package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Wind extends Command{
	public Wind(){
		requires(Robot.catapult);
	}
	
	@Override
	protected void initialize() {

		
	}

	@Override
	protected void execute() {
		Robot.catapult.move(1);
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.catapult.move(0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.catapult.move(0);
	}

}
