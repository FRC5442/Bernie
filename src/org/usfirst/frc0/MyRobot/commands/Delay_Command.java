package org.usfirst.frc0.MyRobot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Delay_Command extends Command {

	double m_start_time = -1.0;
	double m_delay = -1.0;
	
	public Delay_Command(double delay_request) {
	  m_delay = delay_request;
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		m_start_time = Timer.getFPGATimestamp();
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return ;
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
