package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem {
    private Compressor compressor = RobotMap.pneumaticsCompressor;

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Pneumatics() {
        //compressor.start();
    }

    public void initDefaultCommand() {
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


