package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class DriveForward extends Command {
	private double m_distance;
	private double m_speed;
	
	
	public DriveForward(double distance, double speed){
		m_distance = distance;
		m_speed = speed;
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.driveTrain.robotDrive(m_speed, m_speed);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if (RobotMap.EncoderLeft.getDistance() < m_distance){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	protected void end() {
		Robot.driveTrain.robotDrive(0, 0);
	}

	@Override
	protected void interrupted() {
		
	}

}
