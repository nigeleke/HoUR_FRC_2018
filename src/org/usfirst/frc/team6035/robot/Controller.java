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
		
		return stick.getRawAxis(0);
	
	}
	
	double getDriveDirection() {
		
		return stick.getRawAxis(1);
	
	}

}
