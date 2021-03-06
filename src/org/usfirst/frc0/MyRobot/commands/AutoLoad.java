package org.usfirst.frc0.MyRobot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc0.MyRobot.*;

public class AutoLoad extends Command{

	@Override
	protected void initialize() {
		while(RobotMap.limitSwitch.get() == false){
			Robot.winchCylinder.wCylinder(true);
			Timer.delay(.5);
			RobotMap.winchMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 1);
			
		}
		Timer.delay(.5);
		RobotMap.winchMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 0);
		Timer.delay(.25);
		Robot.winchCylinder.wCylinder(false);
		
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
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
