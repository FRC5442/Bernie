// Robot Map
// Motor Controllers
// Encoders
// Et Cetera

package org.usfirst.frc0.MyRobot;
    

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
import com.kauailabs.navx_mxp.AHRS;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
	// dTSparkControllerX = driveTrainSparkControllerX
	// Speed controllers
	public static SpeedController dTSparkController1;
	public static SpeedController dTSparkController2;
	public static SpeedController dTSparkController3;
	public static SpeedController dTSparkController4;
	//Intake and Winch Motors
	public static CANTalon winchMotor;
	public static CANTalon portBar;
	public static SpeedController intakeRoller;
	public static SpeedController parallelBar;
	// Encoders and Daniel's stuff
	public static RobotDrive driveTrainRobotDrive;
	public static Encoder EncoderLeft;
	public static Encoder EncoderRight;
	// NavX accelerometer board
	public static AHRS imu;
	public static SerialPort navXBoard;
	// Pneumatics!
	public static AnalogInput PressureGauge;
	public static Compressor compressor;
	public static DoubleSolenoid wCylinder;
    public static Solenoid trigger;
    public static Compressor pneumaticsCompressor;
    // Lights!
    public static DoubleSolenoid light;
	//public static DoubleSolenoid ledlights;
    //public static Solenoid LedLights2;
    // Other Stuff
    public static DigitalInput limitSwitch;

    public static void init() {
    	// Sparks!
    	dTSparkController1 = new Spark(1);
    	dTSparkController2 = new Spark(2);
    	dTSparkController3 = new Spark(3);
    	dTSparkController4 = new Spark(4);
    	driveTrainRobotDrive = new RobotDrive(dTSparkController1, dTSparkController3,
    	dTSparkController2, dTSparkController4);
    	
    	
    	winchMotor = new CANTalon(5);
    	portBar = new CANTalon(6);
    	
    	intakeRoller = new Talon(7);
    	parallelBar= new Talon(8);
    	
    	// Encoder Code CP&P - Fred
    	EncoderLeft = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Encoders", "Quadrature Encoder Left", EncoderLeft);
        EncoderLeft.setSamplesToAverage(5);
        EncoderLeft.setDistancePerPulse(1.0/360);
        //EncoderLeft.setPIDSourceParameter(PIDSourceParameter.kDistance);
        
        EncoderRight = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Encoders", "Quadrature EncoderRight", EncoderRight);
        EncoderRight.setSamplesToAverage(5);
        EncoderRight.setDistancePerPulse(1.0/360);
        
        PressureGauge = new AnalogInput(4);
        limitSwitch = new DigitalInput(5);
        
        trigger = new Solenoid(2);
        
        wCylinder = new DoubleSolenoid(0, 0, 1);
        
        light = new DoubleSolenoid(0, 0, 0);
        
        navXBoard = new SerialPort(57600,SerialPort.Port.kMXP);
        byte update_rate_hz = 50;
        imu = new AHRS(navXBoard,update_rate_hz);
        pneumaticsCompressor = new Compressor(0);
    }
}
