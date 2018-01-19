package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;

/**
 * @author Jack Gumley
 * Class for managing input from the robot and the user
 */

public class Controller {

	Joystick stick = new Joystick(0);
	DigitalInput grabberLimitSwitch = new DigitalInput(1);
	
	
	double getDriveSpeed() {
		
		double SpeedY = stick.getRawAxis(1);
		double Throttle = ((stick.getThrottle()) * -1 ) + 1;
		double AltThrottle = (SpeedY) * (Throttle/2);
		double FinThrottle = (AltThrottle);
		
		return FinThrottle;
	
	}
	
	double getDriveDirection() {
		
		return stick.getRawAxis(1);
	
	}
	
	GrabberOperation getGrabberOperation() {
		return GrabberOperation.STOP; // TODO: write this method
		
	}
	GrabberArmOperation getGrabberArmOperation() {
		return GrabberArmOperation.STOP; // TODO: write this method
	}
	LiftOperation getLiftOperation() {
		return LiftOperation.STOP; // TODO: write this method
	}

}
