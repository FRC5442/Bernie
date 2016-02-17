// Robot Map
// Motor Controllers
// Encoders
// Et Cetera

package org.usfirst.frc0.MyRobot;
    

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
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
	public static SpeedController dTSparkController1;
	public static SpeedController dTSparkController2;
	public static SpeedController dTSparkController3;
	public static SpeedController dTSparkController4;
	public static SpeedController intakeController;
	public static RobotDrive driveTrainRobotDrive;
	public static Encoder EncoderLeft;
	public static Encoder EncoderRight;
	public static AHRS imu;
	public static SerialPort navXBoard;


    public static void init() {
    	//dTSparkController1 = new Talon(1);
    	//dTSparkController2 = new Talon(2);
    	//dTSparkController3 = new Talon(3);
    	//dTSparkController4 = new Talon(4);
    	
    	dTSparkController1 = new Victor(1);
    	dTSparkController2 = new Victor(2);
    	dTSparkController3 = new Victor(3);
    	dTSparkController4 = new Victor(4);
    	driveTrainRobotDrive = new RobotDrive(dTSparkController1, dTSparkController3,
    	dTSparkController2, dTSparkController4);
    	intakeController = new Talon(5);
    	//check port
    	// Encoder Code CP&P - Fred
    	EncoderLeft = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Encoders", "Quadrature Encoder Left", EncoderLeft);
        EncoderLeft.setSamplesToAverage(5);
        EncoderLeft.setDistancePerPulse(1.0/360);
        //EncoderLeft.setPIDSourceParameter(PIDSourceParameter.kDistance);
        EncoderRight = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Encoders", "Quadrature EncoderRight", EncoderRight);
        EncoderRight.setSamplesToAverage(5);
        EncoderRight.setDistancePerPulse(1.0/360);
        
        navXBoard = new SerialPort(57600,SerialPort.Port.kMXP);
        byte update_rate_hz = 50;
        imu = new AHRS(navXBoard,update_rate_hz);
    	    	
    }
}
