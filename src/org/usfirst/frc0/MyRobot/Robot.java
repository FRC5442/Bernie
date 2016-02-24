// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc0.MyRobot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc0.MyRobot.commands.*;
//import org.usfirst.frc0.MyRobot.commands.Parallel;
import org.usfirst.frc0.MyRobot.subsystems.*;
import org.usfirst.frc0.MyRobot.subsystems.Pneumatics;
import org.usfirst.frc0.MyRobot.RobotMap;

import com.kauailabs.nav6.frc.IMU;

@SuppressWarnings("unused")
public class Robot extends IterativeRobot {

    Command autonomousCommand;
    SendableChooser autonomousModes;
    Preferences prefs;
    public static OI oi;
    public static DriveTrain driveTrain;
    public static Sensors sensors;
    public static NavXBoard navXBoard;
    public static Intake intake;
    public static Catapult catapult;
    public static LatchCylinder latchCylinder;
    public static WinchCylinder winchCylinder;
    public static Arm arm;
    //public static Parallel parallelBar;
    public static Lights lights;
    public static Pneumatics pneumatics;
    
    public void robotInit() {
    RobotMap.init();
    	intake = new Intake();
        driveTrain = new DriveTrain();
        sensors = new Sensors();
        catapult = new Catapult();
        latchCylinder = new LatchCylinder();
        prefs = Preferences.getInstance();
        Robot.sensors.encoderLeft.reset();
        Robot.sensors.encoderRight.reset();
        navXBoard = new NavXBoard();
        oi = new OI();
        arm = new Arm();
        //parallelBar = new Parallel();
        lights = new Lights();
        pneumatics = new Pneumatics();
    }

    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
        
        /** Smart Dashboard
         * This gives a sendable chooser for the Autonomous Modes
         * Low Bar
         * Rough Terrain
         * Rock Wall
         * Moat
         * Rampart
         * Portcullis
         */
        autonomousModes = new SendableChooser();
        autonomousModes.addDefault("Low Bar Autonomous",  new LowBarAuto());
        autonomousModes.addObject("Rough Terrain Autonomous", new RoughTerrainAuto());
        autonomousModes.addObject("Rock Wall Autonomous", new RockWallAuto());
        autonomousModes.addObject("Moat Autonomous", new MoatAuto());
        autonomousModes.addObject("Rampart Autonomous", new RampartAuto());
        autonomousModes.addObject("Portcullis Autonomous", new PortcullisAuto());
        autonomousModes.addObject("Cheval Autonomous", new ChevalAuto());
        SmartDashboard.putData("Autonomous Mode Chooser", autonomousModes);
    }

    public void autonomousInit() {
        RobotMap.EncoderLeft.reset();
        RobotMap.EncoderRight.reset();
        RobotMap.navXBoard.reset();
    	RobotMap.imu.zeroYaw();
    	if (autonomousCommand != null) autonomousCommand.start();
        autonomousCommand = (Command) autonomousModes.getSelected();
        autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	Scheduler.getInstance().run();
    	SmartDashboard.putNumber("Encoder Left", Robot.sensors.encoderLeft.getDistance());
        SmartDashboard.putNumber("Encoder Right", Robot.sensors.encoderRight.getDistance());
        double Volts = RobotMap.PressureGauge.getVoltage();
        double Pressure = 250*(Volts/5)-25;
        SmartDashboard.putNumber("Pneumatic Pressure", Pressure);
        
    }

    public void teleopInit() {
    	
    	if (autonomousCommand != null) autonomousCommand.cancel();
        
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("Encoder Left", Robot.sensors.encoderLeft.getDistance());
        SmartDashboard.putNumber("Encoder Right", Robot.sensors.encoderRight.getDistance());
        double Volts = RobotMap.PressureGauge.getVoltage();
        double Pressure = 250*(Volts/5)-25;
        SmartDashboard.putNumber("Pneumatic Pressure", Pressure);
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
