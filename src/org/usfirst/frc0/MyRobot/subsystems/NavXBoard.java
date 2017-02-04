package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class NavXBoard extends PIDSubsystem{
	private AHRS gyro = RobotMap.ahrs;

	public NavXBoard() {
		super("Gyro", 2.0,0.0,0.0);
		setAbsoluteTolerance(0.05);
		getPIDController().setContinuous(false);
	}
	public void initDefaultCommand() {
		//setDefaultCommand(new winchMove());
	}
	//Move the winch based on the value passed to it in commands    	
	@Override
	protected double returnPIDInput() {
		return gyro.getYaw();
	}
	@Override
	protected void usePIDOutput(double output) {
		
	}  

}
