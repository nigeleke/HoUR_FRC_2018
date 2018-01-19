package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Controller {

	Joystick stick = new Joystick(0);
	
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

}
