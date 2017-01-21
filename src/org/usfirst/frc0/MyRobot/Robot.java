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

import java.awt.Image;

import org.usfirst.frc0.MyRobot.commands.ChevalAuto;
import org.usfirst.frc0.MyRobot.commands.LowBarAuto;
import org.usfirst.frc0.MyRobot.commands.MoatAuto;
import org.usfirst.frc0.MyRobot.commands.NoAuto;
import org.usfirst.frc0.MyRobot.commands.RampartAuto;
import org.usfirst.frc0.MyRobot.commands.RockWallAuto;
import org.usfirst.frc0.MyRobot.commands.RoughTerrainAuto;
import org.usfirst.frc0.MyRobot.commands.SpyBoxShoot;
import org.usfirst.frc0.MyRobot.commands.StraightThoughDefenseAuto;
//import org.usfirst.frc0.MyRobot.commands.Parallel;
import org.usfirst.frc0.MyRobot.subsystems.Arm;
import org.usfirst.frc0.MyRobot.subsystems.Cameras;
import org.usfirst.frc0.MyRobot.subsystems.Catapult;
import org.usfirst.frc0.MyRobot.subsystems.DriveTrain;
import org.usfirst.frc0.MyRobot.subsystems.Intake;
import org.usfirst.frc0.MyRobot.subsystems.LatchCylinder;
import org.usfirst.frc0.MyRobot.subsystems.NavXBoard;
import org.usfirst.frc0.MyRobot.subsystems.ParallelBar;
import org.usfirst.frc0.MyRobot.subsystems.Pneumatics;
import org.usfirst.frc0.MyRobot.subsystems.Sensors;
import org.usfirst.frc0.MyRobot.subsystems.WinchCylinder;

import com.ctre.CANTalon;
import com.ni.vision.NIVision;
import com.ni.vision.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
    public static ParallelBar parallelBar;
    //public static Lights lights;
    public static Pneumatics pneumatics;
    public static Cameras cameras;
    //public static CameraServer server;
    int session;
    Image frame;
    NIVision.Rect rect;
    
    public void robotInit() {
    RobotMap.init();
    	
    	intake = new Intake();
        driveTrain = new DriveTrain();
        sensors = new Sensors();
        catapult = new Catapult();    
        cameras = new Cameras();
        latchCylinder = new LatchCylinder();
        winchCylinder = new WinchCylinder();
        
        prefs = Preferences.getInstance();
        Robot.sensors.encoderLeft.reset();
        Robot.sensors.encoderRight.reset();
        Robot.sensors.parallelEncoder.reset();
        navXBoard = new NavXBoard();
        oi = new OI();
        arm = new Arm();
        parallelBar = new ParallelBar();
        //lights = new Lights();
        pneumatics = new Pneumatics();
 
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
        autonomousModes.addObject("Low Bar Autonomous",  new LowBarAuto());
        autonomousModes.addObject("Rough Terrain Autonomous", new RoughTerrainAuto());
        autonomousModes.addObject("Rock Wall Autonomous", new RockWallAuto());
        autonomousModes.addObject("Moat Autonomous", new MoatAuto());
        autonomousModes.addObject("Rampart Autonomous", new RampartAuto());
        //autonomousModes.addObject("Portcullis Autonomous", new AutoPort());
        autonomousModes.addObject("Cheval Autonomous", new ChevalAuto());
        autonomousModes.addObject("Spy Box Autonomous", new SpyBoxShoot());
        autonomousModes.addObject("Straight Through Defense Autonomous", new StraightThoughDefenseAuto());
        autonomousModes.addDefault("No autonomous", new NoAuto());
        SmartDashboard.putData("Autonomous Mode Chooser", autonomousModes);
        
        //CameraServer server2;
        
        //server = CameraServer.getInstance();
        /*if (CameraServer.getInstance() == null) {
        	
        } else {
        	server = CameraServer.getInstance();
        	server.setQuality(25);
            server.startAutomaticCapture("cam0");
        	/*server2 = CameraServer.getInstance();
        	server2.setQuality(25);
            server2.startAutomaticCapture("cam2");
            }
            */
        
        
    }

    public void disabledInit(){
    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
        
       
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
        SmartDashboard.putNumber("Parallel Bar Encoder", Robot.sensors.parallelEncoder.getDistance());
        //double VoltsOut = RobotMap.PressureGauge.getVoltage();
        //double Pressure = (250*(VoltsOut/5)-25);
        //SmartDashboard.putNumber("Pneumatic Pressure", Pressure);
        //SmartDashboard.putNumber("Pneumatic Gauge Output Voltage", VoltsOut);
        //SmartDashboard.putNumber("Ultrasonic Range: Ready to shoot when under 5 inches", Robot.sensors.ultrasonic.getRangeInches());
   
    }

    public void teleopInit() {
    	
    	if (autonomousCommand != null) autonomousCommand.cancel();
    	cameras.init();


        
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("Arm Encoder", ((CANTalon) RobotMap.armMotor).getEncPosition());
        SmartDashboard.putNumber("Arm Encoder2", ((CANTalon) RobotMap.armMotor).getPulseWidthRiseToFallUs());
        
        if(OI.xboxController.getRawAxis(2) > 0.1)
        {
        	arm.turn(-1*OI.xboxController.getRawAxis(2));
        }
        else if(OI.xboxController.getRawAxis(3) > 0.1)
        {
        	arm.turn(OI.xboxController.getRawAxis(3));
        }
        else{
        	
        	arm.turn(0.0);
        }
        
        SmartDashboard.putNumber("Encoder Left", Robot.sensors.encoderLeft.getDistance());
        SmartDashboard.putNumber("Encoder Right", Robot.sensors.encoderRight.getDistance());
        SmartDashboard.putNumber("Parallel Bar Encoder", Robot.sensors.parallelEncoder.getDistance());
        double VoltsOut = RobotMap.PressureGauge.getVoltage();
        double Pressure = (250*(VoltsOut/5)-25);
        SmartDashboard.putNumber("Pneumatic Pressure", Pressure);
        SmartDashboard.putNumber("Pneumatic Gauge Output Voltage", VoltsOut);
        //SmartDashboard.putNumber("Ultrasonic Range: Ready to shoot when under 5 inches", Robot.sensors.ultrasonic.getRangeInches());
        //server.startAutomaticCapture("cam2");
        cameras.updateCam();
        //SmartDashboard.putNumber("Arm Encoder", Robot.sensors.armEncoder.getDistance());
        
        
        
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
