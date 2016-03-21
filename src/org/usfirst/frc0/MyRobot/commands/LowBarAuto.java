// Low Bar Autonomous
// Finished w/o PID
package org.usfirst.frc0.MyRobot.commands;

import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class LowBarAuto extends Command {

	@Override
	protected void initialize() {
		//org.usfirst.frc0.MyRobot.Robot.sensors.encoderLeft.reset();
		//org.usfirst.frc0.MyRobot.Robot.sensors.encoderRight.reset();
		//RobotMap.EncoderLeft.reset();
		//RobotMap.EncoderRight.reset();
		
	}

	@Override
	protected void execute() {
		//while(RobotMap.EncoderRight.getDistance() <= 12){
		org.usfirst.frc0.MyRobot.Robot.driveTrain.robotDrive(.8, .8);
		SmartDashboard.putNumber("Auto Encoder Value", RobotMap.EncoderRight.getDistance());
		//}
		//Robot.driveTrain.robotDrive(0, 0);
		
	}

	@Override
	protected boolean isFinished() {
		//return false;
		return (RobotMap.EncoderLeft.getDistance() > 12);
	}

	@Override
	protected void end() {
		Robot.driveTrain.robotDrive(0, 0);
	}

	@Override
	protected void interrupted() {
		Robot.driveTrain.robotDrive(0, 0);
	}

}
