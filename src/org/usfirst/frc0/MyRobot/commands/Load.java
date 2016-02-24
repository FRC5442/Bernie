package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Load extends Command {
	public Load(){
		requires(Robot.catapult);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		//Robot.catapult.wrap(1);
		if(RobotMap.limitSwitch.get() != true){
			while (RobotMap.limitSwitch.get() != true){
			Robot.catapult.wrap(1);
		}
		Robot.catapult.wrap(0);
		Timer.delay(1);
		RobotMap.wCylinder.set(DoubleSolenoid.Value.kForward);
		}else if (RobotMap.limitSwitch.get() == true){
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
		Robot.catapult.wrap(0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.catapult.wrap(0);
	}

}
