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
import com.ctre.*;
import com.ni.vision.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
	// dTSparkControllerX = driveTrainSparkControllerX
	// Speed controllers
	//// DriveTrain
	public static SpeedController dTSparkController1;
	public static SpeedController dTSparkController2;
	public static SpeedController dTSparkController3;
	public static SpeedController dTSparkController4;
	public static RobotDrive driveTrainRobotDrive;
	////Intake and Winch Motors
	public static CANSpeedController winchMotor;
	public static CANSpeedController armMotor;
	public static Talon intakeRoller;
    public static Talon intake;
	// Encoders
	public static Encoder EncoderLeft;
	public static Encoder EncoderRight;
	public static Encoder ParallelEncoder;
	//public static Ultrasonic ultrasonic;
	// NavX accelerometer board
	public static AHRS imu;
	public static SerialPort navXBoard;
	// Pneumatics
	public static AnalogInput PressureGauge;
	public static Compressor compressor;
  // CHANGE FOR PRACTICE TO COMPETITION DONE DONE DONE DOOOONNNEE
	public static Solenoid wCylinder;
    public static Solenoid trigger;
  //CHANGE FOR PRACTICE TO COMPETITION END
    public static Compressor pneumaticsCompressor;
    // Lights!
    public static DoubleSolenoid light;
	//public static DoubleSolenoid ledlights;
    //public static Solenoid LedLights2;
    // Other Stuff
    public static DigitalInput limitSwitch;
	public static CANSpeedController parallelBar;

    public static void init() {
    	// Sparks!
    ////Change for competition Robot start DONE DONE DONE DOOOONNNEE
    	dTSparkController1 = new Spark(2);
    	dTSparkController2 = new Spark(3);
    	dTSparkController3 = new Spark(4);
    	dTSparkController4 = new Spark(5);
    	//dTSparkController1 = new Spark(1);
    	//dTSparkController2 = new Spark(3);
    	//dTSparkController3 = new Spark(2);
    	//dTSparkController4 = new Spark(4);
    ////Change for Competition Robot end
    	driveTrainRobotDrive = new RobotDrive(dTSparkController1, dTSparkController2,
    	dTSparkController3, dTSparkController4);
    	winchMotor = new CANTalon(7);
    	armMotor = new CANTalon(8);
    	((CANTalon) armMotor).setFeedbackDevice(CANTalon.FeedbackDevice.CtreMagEncoder_Relative);
    	//remember CANTalons are named by the RIO Interface ID number
    	//parallelBar = new CANTalon(9);
    ////Change for Competition Robot start DONE DONE DONE DOOOONNNEE
    	intakeRoller = new Talon(1);
    	//intakeRoller = new Talon(6);
    ////Change for Competition Robot end
    	intake = new Talon(6);
    	// Encoder Code CP&P - Fred
    	EncoderLeft = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Encoders", "Quadrature Encoder Left", EncoderLeft);
        EncoderLeft.setSamplesToAverage(5);
        EncoderLeft.setDistancePerPulse(1.0/360);
        //EncoderLeft.setPIDSourceParameter(PIDSourceParameter.kDistance);
        
        EncoderRight = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("Encoders", "Quadrature EncoderRight", EncoderRight);
        EncoderRight.setSamplesToAverage(5);
        EncoderRight.setDistancePerPulse(1.0/360);
        
    	ParallelEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Encoders", "Quadrature Encoder Arm", ParallelEncoder);
        ParallelEncoder.setSamplesToAverage(5);
        ParallelEncoder.setDistancePerPulse(1.0/360);
        
        //Ultrasonic ultra = new Ultrasonic(6,7);
        //ultra.setAutomaticMode(true);
        PressureGauge = new AnalogInput(4);
        limitSwitch = new DigitalInput(9);
        
        // Change for Practice to Competition Robot DONE DONE DONE DOOOONNNEE
        wCylinder = new Solenoid(1);
        trigger = new Solenoid(2);
        //wCylinder = new DoubleSolenoid(3, 4);
        //trigger = new DoubleSolenoid(1, 2);
        // Change for Practice to Competition Robot End
        
        
        //light = new DoubleSolenoid(3, 0, 1);
        
        navXBoard = new SerialPort(57600,SerialPort.Port.kMXP);
        byte update_rate_hz = 50;
        imu = new AHRS(navXBoard,update_rate_hz);
        pneumaticsCompressor = new Compressor(0);
        
    }
}
