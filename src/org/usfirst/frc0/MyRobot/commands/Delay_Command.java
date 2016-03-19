package org.usfirst.frc0.MyRobot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Delay_Command extends Command {

	private double m_start_time = -1.0;
	private double m_delay = -1.0;
	
	public Delay_Command(double delay_request) {
	  m_delay = delay_request;
	}
	
	@Override
	protected void initialize() {
		m_start_time = Timer.getFPGATimestamp();
	}

	@Override
	protected void execute() {
		
	}

	@Override
	protected boolean isFinished() {
		if((m_start_time + m_delay) < Timer.getFPGATimestamp()){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	protected void end() {
		
	}

	@Override
	protected void interrupted() {
		
	}

}
