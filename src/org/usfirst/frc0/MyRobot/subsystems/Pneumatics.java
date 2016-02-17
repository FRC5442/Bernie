package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem{
	private Compressor compressor = RobotMap.compressor;
	
	public Pneumatics() {
		compressor.start();
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
