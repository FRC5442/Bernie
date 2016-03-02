// OI
// Contains:
// 	Controller Int
// 	Joystick Buttons
// 	Last Edit: 

// Plan: Get the navX Board working and programmed. When the auto is done, have navx say where the robot is facing, and have it face a certain way using PID. Recall videos
package org.usfirst.frc0.MyRobot;

import org.usfirst.frc0.MyRobot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    /*CREATING BUTTONS
     One type of button is a joystick button which is any button on a joystick.
     You create one by telling it which joystick it's on and which button
     number it is.
     Joystick stick = new Joystick(port);
     Button button = new JoystickButton(stick, buttonNumber);
     There are a few additional built in buttons you can use. Additionally,
     by subclassing Button you can create custom triggers and bind those to
     commands the same as any other Button.
    TRIGGERING COMMANDS WITH BUTTONS
     Once you have a button, it's trivial to bind it to a button in one of
     three ways:
     Start the command when the button is pressed and let it run the command
     until it is finished as determined by it's isFinished method.
     button.whenPressed(new ExampleCommand());
     Run the command while the button is being held down and interrupt it once
     the button is released.
     button.whileHeld(new ExampleCommand());
     Start the command when the button is released  and let it run the command
     until it is finished as determined by it's isFinished method.
    button.whenReleased(new ExampleCommand());
    */
    
    public static Joystick xboxController;
    public static Joystick xboxController2;
    public JoystickButton xboxAButton;
    public JoystickButton xboxBButton;
    public JoystickButton xboxXButton;
    public JoystickButton xboxYButton;
    public JoystickButton xboxAButton2;
    public JoystickButton xboxBButton2;
    public JoystickButton xboxXButton2;
    public JoystickButton xboxYButton2;
    public JoystickButton xboxLeftTrigger2;
    public JoystickButton xboxRightTrigger2;

    public OI() {
        xboxController = new Joystick(0);
        xboxController2 = new Joystick(1);
        
        xboxAButton = new JoystickButton(xboxController, 1);
        //xboxAButton.whileHeld(new Parallel());
        xboxBButton = new JoystickButton(xboxController, 2);
        xboxBButton.whileHeld(new Intaking());
        xboxXButton = new JoystickButton(xboxController, 3);
        xboxYButton = new JoystickButton(xboxController, 4);
       
        xboxAButton2 = new JoystickButton(xboxController2, 1);
        //xboxAButton2.whileHeld(new PortArmDown());
        xboxAButton2.whileHeld(new Shoot());
        
        xboxBButton2 = new JoystickButton(xboxController2, 2);
        xboxBButton2.whileHeld(new Wind());
        xboxXButton2 = new JoystickButton(xboxController2, 3);
        xboxXButton2.whileHeld(new ClutchOut());
        xboxYButton2 = new JoystickButton(xboxController2, 4);
        xboxYButton2.whileHeld(new Clutch());
        
        // SmartDashboard Buttons
        //SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        
       // xboxLeftTrigger2 = new JoystickButton (xboxController2, 1);
       // xboxLeftTrigger2.whenActive(new PortArmDown());
        //xboxRightTrigger2 = new JoystickButton (xboxController2, 2);
        //xboxRightTrigger2.whenActive(new PortArmUpp());
    }
    
    public Joystick getXboxController() {
        return xboxController;
    }
    public Joystick getXboxController2() {
    	return xboxController2;
    }
}

