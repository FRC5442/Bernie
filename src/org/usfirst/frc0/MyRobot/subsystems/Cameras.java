
package org.usfirst.frc0.MyRobot.subsystems;

import com.ni.vision.*;
import com.ni.vision.NIVision.Image;
import edu.wpi.first.wpilibj.CameraServer;

public class Cameras
{
	private final int camLeft;
	private final int camShooter;
	private int curCam;
	private Image frame;
	private CameraServer server;
	private String camLeftName = "cam1";
	private String camShooterName = "cam0";
	private int camQuality = 25;
	
	public Cameras()
	{
        // Get camera ids by supplying camera name ex 'cam0', found on roborio web interface
        camLeft = NIVision.IMAQdxOpenCamera(camLeftName, NIVision.IMAQdxCameraControlMode.CameraControlModeController);
        camShooter = NIVision.IMAQdxOpenCamera(camShooterName, NIVision.IMAQdxCameraControlMode.CameraControlModeController);
        curCam = camLeft;
        // Img that will contain camera img
        frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
        // Server that we'll give the img to
        server = CameraServer.getInstance();
        
        
	}
	
	public void init()
	{
		changeCam(camLeft);
	}
		
	public void run()
	{
		if(curCam == camLeft)
		{
			changeCam(camShooter);
		}
		else if(curCam == camShooter)
		{
			changeCam(camLeft);
		}
		updateCam();
	}
	
	 //Stop aka close camera stream
	public void end()
	{
		NIVision.IMAQdxStopAcquisition(curCam);
	}
	
	
	 //Change the camera to get imgs from to a different one
	 //@param newId for camera
	 
	public void changeCam(int newId)
    {
		NIVision.IMAQdxStopAcquisition(curCam);
    	NIVision.IMAQdxConfigureGrab(newId);
    	NIVision.IMAQdxStartAcquisition(newId);
    	curCam = newId;
    }
    
	
	 
	 //Get the img from current camera and give it to the server
	
    public void updateCam()
    {
    	NIVision.IMAQdxGrab(curCam, frame, 1);
        
    }
}
