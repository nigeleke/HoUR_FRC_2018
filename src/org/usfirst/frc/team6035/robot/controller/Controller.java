package org.usfirst.frc.team6035.robot.controller;

import edu.wpi.first.wpilibj.DigitalInput;
import org.usfirst.frc.team6035.robot.gamecomponents.*;
import org.usfirst.frc.team6035.robot.*;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

/**
 * @author Jack Gumley
 * Class for managing input from the robot and the user
 */

public class Controller {

	private Joystick stick = new Joystick(Config.JOYSTICK_PORT);
	private XboxController xbox = new XboxController(Config.XBOX_PORT);
	private DigitalInput grabberLimitSwitch = new DigitalInput(Config.GRABBER_SWITCH_CHANNEL);
	
	
	
	  public double getDriveSpeed() {

		    double speedY = stick.getY();
		    double throttle = ((stick.getThrottle()) * -1 );
		    double normalisedThrottle =  ((throttle + 1.0) / 2.0);
		    normalisedThrottle = (normalisedThrottle < 0.25? 0.25 : normalisedThrottle);
		    double throttledSpeed = speedY * normalisedThrottle;
		    return throttledSpeed;

		  }

	
	public double getDriveDirection() {
		
		double twist = stick.getZ();
		double tilt = stick.getX();
		boolean twistOrTilt = stick.getRawButton(2);
		double direction = (twistOrTilt? twist : tilt);
		
		return direction;
	
	}
	
	/**
	 * Return operation for the grabber based off controller input
	 */
	public GrabberOperation getGrabberOperation() {
		boolean leftButtonPressed = xbox.getXButton();
		boolean rightButtonPressed = xbox.getBButton();
		boolean grabberMicroSwitchClosed = grabberLimitSwitch.get();
		
		if ((leftButtonPressed) && (!rightButtonPressed)) {
			/*
			if (!grabberMicroSwitchClosed) {
				return GrabberOperation.GRAB;
			}
			else {
				return GrabberOperation.HOLD;
			}
			*/
			return GrabberOperation.GRAB;
		}
		if ((rightButtonPressed) && (!leftButtonPressed)) {
		return GrabberOperation.LET_GO;
		}
		return GrabberOperation.STOP;
	}
	/**
	 * Return operation for grabber arm based off controller input
	 */
	public GrabberArmOperation getGrabberArmOperation() {
		boolean topButtonPressed = xbox.getYButton();
		boolean bottomButtonPressed = xbox.getAButton();
		
		if ((topButtonPressed) && (!bottomButtonPressed)) {
			return GrabberArmOperation.UP;
		}
		if ((bottomButtonPressed) && (!topButtonPressed)) {
			return GrabberArmOperation.DOWN;
		}
		return GrabberArmOperation.STOP; 
	}
	/**
	 * Return operation for lift based off controller input
	 */
	public LiftOperation getLiftOperation() {
		int dpadVal = xbox.getPOV();
		boolean goUp = (325 <= dpadVal && dpadVal < 360) || (0 <= dpadVal && dpadVal <= 45);
		boolean goDown = (135 <= dpadVal && dpadVal < 225);
		
		if ((goUp) && (!goDown)) {
			return LiftOperation.UP;
		}
		if ((goDown) && (!goUp)) {
			return LiftOperation.DOWN;
		}
		return LiftOperation.STOP; 
	}
	
	/**
	 * Return operation for climber based off controller input
	 */
	
	public ClimberOperation getClimberOperation() {
		boolean leftBumperPressed = xbox.getBumper(GenericHID.Hand.kLeft);
		boolean rightBumperPressed = xbox.getBumper(GenericHID.Hand.kRight);
		boolean bothBumpersPressed = leftBumperPressed && rightBumperPressed;
		if(bothBumpersPressed) {
			return ClimberOperation.UP;
		}
		return ClimberOperation.STOP;
	}

}
