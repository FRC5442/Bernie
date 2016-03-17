// Rough Terrain Auto
// FINISHED W/O PID Turning
package org.usfirst.frc0.MyRobot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc0.MyRobot.Robot;
import org.usfirst.frc0.MyRobot.RobotMap;
import edu.wpi.first.wpilibj.Timer;

public class RoughTerrainAuto extends Command{

	@Override
	protected void initialize() {
	
		
	}

	@Override
	protected void execute() {
		while(-1 * (RobotMap.EncoderLeft.getDistance()) <= 14);{
			Robot.driveTrain.robotDrive(.65, .65);
		}
		Timer.delay(1);
		Robot.driveTrain.robotDrive(0,0);
		
	}

	@Override
	protected boolean isFinished() {
		return false;
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
