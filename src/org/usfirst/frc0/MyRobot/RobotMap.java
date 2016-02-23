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
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.AnalogInput;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
	// dTSparkControllerX = driveTrainSparkControllerX
	public static SpeedController dTSparkController1;
	public static SpeedController dTSparkController2;
	public static SpeedController dTSparkController3;
	public static SpeedController dTSparkController4;
	public static SpeedController intake;
	public static SpeedController armMotor;
	public static SpeedController parallelBars;
	public static CANTalon SRX1;
	public static CANTalon SRX2;
	public static SpeedController SR1;
	public static SpeedController SR2;
	public static CANTalon catapultWinch;
	public static Potentiometer winchPot;
	public static RobotDrive driveTrainRobotDrive;
	public static Encoder EncoderLeft;
	public static Encoder EncoderRight;
	public static AHRS imu;
	public static SerialPort navXBoard;
	public static Compressor compressor;
	public static DoubleSolenoid cylinder;
	public static DoubleSolenoid wCylinder;
	public static Solenoid light;
	public static DoubleSolenoid ledlights;
    public static Solenoid LedLights2;
    public static AnalogInput PressureGauge;



    public static void init() {
    	//dTSparkController1 = new Talon(1);
    	//dTSparkController2 = new Talon(2);
    	//dTSparkController3 = new Talon(3);
    	//dTSparkController4 = new Talon(4);
    	
    	dTSparkController1 = new Spark(1);
    	dTSparkController2 = new Spark(2);
    	dTSparkController3 = new Spark(3);
    	dTSparkController4 = new Spark(4);
    	driveTrainRobotDrive = new RobotDrive(dTSparkController1, dTSparkController3,
    	dTSparkController2, dTSparkController4);
    	
    	//armMotor = new Talon(12345);
    	
    	//parallelBars = new Talon(123456);
    	/**
    	 * 
    	 *  
    	 *  
    	 *  Fix these stinking ports
    	 **/
    	//SRX1 = new CANTalon(50002);
    	//SRX2 = new CANTalon(50003);
    	
    	//SR1 = new Talon(1);
    	//SR2 = new Talon(2);
    	
    	//intake = new Talon(5);
    	//check port
    	
    	//catapultWinch = new CANTalon(1);
    	//catapultWinch.setFeedbackDevice(CANTalon.FeedbackDevice.AnalogPot);
    	
    	//winchPot = new AnalogPotentiometer(0, 360, 30);
    	//check what arguments are
    	
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
        
        //PressureGauge = new AnalogInput(11111111);
        
        //cylinder = new DoubleSolenoid(0, 0, 1);
        
        //wCylinder = new DoubleSolenoid(0, 0, 2);
        
        //light = new Solenoid(0, 1);
        
        navXBoard = new SerialPort(57600,SerialPort.Port.kMXP);
        byte update_rate_hz = 50;
        imu = new AHRS(navXBoard,update_rate_hz);
    	    	
    }
}
