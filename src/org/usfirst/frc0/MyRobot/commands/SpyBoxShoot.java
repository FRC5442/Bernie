package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;
import org.usfirst.frc0.MyRobot.subsystems.LatchCylinder;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class SpyBoxShoot extends Command {
	private LatchCylinder latchCylinder = Robot.latchCylinder;
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		while (RobotMap.EncoderRight.getDistance() < 4.5){
			Robot.driveTrain.robotDrive(-.65, -.65);
			SmartDashboard.putNumber("Auto Encoder Value", RobotMap.EncoderRight.getDistance());
		}
		Robot.driveTrain.robotDrive(0, 0);
		Timer.delay(1);
		//for(int i = 0; i<1; i++){
		latchCylinder.cylinder(DoubleSolenoid.Value.kReverse);
		Timer.delay(1);
		latchCylinder.cylinder(DoubleSolenoid.Value.kForward);
		//}
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.driveTrain.robotDrive(0, 0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.driveTrain.robotDrive(0, 0);
	}

}
