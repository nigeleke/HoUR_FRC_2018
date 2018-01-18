package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Controller {

	Joystick stick = new Joystick(0);
	
	double getDriveSpeed() {
		
		return stick.getRawAxis(0);
	
	}
	
	double getDriveDirection() {
		
		return stick.getRawAxis(1);
	
	}

}
