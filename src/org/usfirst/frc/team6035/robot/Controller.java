package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

/**
 * @author Jack Gumley
 * Class for managing input from the robot and the user
 */

public class Controller {

	Joystick stick = new Joystick(Config.JOYSTICK_PORT);
	XboxController xbox = new XboxController(Config.XBOX_PORT);
	DigitalInput grabberLimitSwitch = new DigitalInput(Config.GRABBER_SWITCH_CHANNEL);
	
	
	double getDriveSpeed() {
		
		double SpeedY = stick.getY();
		double Throttle = ((stick.getThrottle()) * -1 ) + 1;
		double AltThrottle = (SpeedY) * (Throttle/2);
		double FinThrottle = (AltThrottle);
		System.out.println("Speed "+SpeedY+" Throttle "+Throttle+" AltThrottle "+AltThrottle+" FinThrottle "+FinThrottle);
		return FinThrottle;
	
	}
	
	double getDriveDirection() {
		
		return stick.getX();
	
	}
	
	/**
	 * Return operation for the grabber based off controller input
	 */
	GrabberOperation getGrabberOperation() {
		boolean leftButtonPressed = xbox.getXButtonPressed();
		boolean rightButtonPressed = xbox.getBButtonPressed();
		boolean grabberMicroSwitchClosed = grabberLimitSwitch.get();
		
		if ((leftButtonPressed) && (!rightButtonPressed)) {
			if (grabberMicroSwitchClosed = false) {
				return GrabberOperation.GRAB;
			}
			else {
				return GrabberOperation.HOLD;
			}
		}
		if ((rightButtonPressed) && (!leftButtonPressed)) {
		return GrabberOperation.LET_GO;
		}
		return GrabberOperation.STOP;
	}
	/**
	 * Return operation for grabber arm based off controller input
	 */
	GrabberArmOperation getGrabberArmOperation() {
		boolean topButtonPressed = xbox.getYButtonPressed();
		boolean bottomButtonPressed = xbox.getAButtonPressed();
		
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
	LiftOperation getLiftOperation() {
		int dpadVal = xbox.getPOV();
		boolean goUp = (325 <= dpadVal && dpadVal < 360) || (0 <= dpadVal && dpadVal < 45);
		boolean goDown = (135 <= dpadVal && dpadVal < 225);
		
		if ((goUp) && (!goDown)) {
			return LiftOperation.UP;
		}
		if ((goDown) && (!goUp)) {
			return LiftOperation.DOWN;
		}
		return LiftOperation.STOP; 
	}
	ClimberOperation getClimberOperation() {
		int dpadVal = xbox.getPOV();
		boolean goUP = (135 <= dpadVal && dpadVal < 225);
		if (goUP) {
			return ClimberOperation.UP;
		}
			return ClimberOperation.STOP;
	}

}
