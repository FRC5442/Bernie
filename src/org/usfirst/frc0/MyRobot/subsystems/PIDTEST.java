package org.usfirst.frc0.MyRobot.subsystems;

import org.usfirst.frc0.MyRobot.RobotMap;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class PIDTEST extends Subsystem implements PIDOutput{
	
	PIDController turnController;
    double rotateToAngleRate;
    AHRS ahrs = RobotMap.ahrs;
    
    
    public PIDTEST(){
    	 final double kP = 0.03;
         final double kI = 0.00;
         final double kD = 0.00;
         final double kF = 0.00;
         
       /* This tuning parameter indicates how close to "on target" the    */
       /* PID Controller will attempt to get.                             */

         final double kToleranceDegrees = 2.0f;
         
         try {
             /* Communicate w/navX-MXP via the MXP SPI Bus.                                     */
             /* Alternatively:  I2C.Port.kMXP, SerialPort.Port.kMXP or SerialPort.Port.kUSB     */
             /* See http://navx-mxp.kauailabs.com/guidance/selecting-an-interface/ for details. */
             ahrs = new AHRS(SerialPort.Port.kUSB); 
         } catch (RuntimeException ex ) {
             DriverStation.reportError("Error instantiating navX-MXP:  " + ex.getMessage(), true);
         }
         turnController = new PIDController(kP, kI, kD, kF, ahrs, this);
         turnController.setInputRange(-180.0f,  180.0f);
         turnController.setOutputRange(-1.0, 1.0);
         turnController.setAbsoluteTolerance(kToleranceDegrees);
         turnController.setContinuous(true);
         
         LiveWindow.addActuator("DriveSystem", "RotateController", turnController);
    }
	
	@Override
	public void pidWrite(double output) {
			rotateToAngleRate = output;
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
