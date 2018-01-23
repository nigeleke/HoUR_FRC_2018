package org.usfirst.frc.team6035.robot;

/**
 * Provides hardware configuration for the RoboRio channels
 * @author Gabe Love
 * Edited by = Ethan Sigler
 */
public class Config {

	// Ports 
	static int JOYSTICK_PORT = 0;
	static int XBOX_PORT = 1;

	
	// Channels
	static int DB_LEFT_BACK_CHANNEL = 0;
	static int DB_LEFT_FRONT_CHANNEL = 1;
	static int DB_RIGHT_BACK_CHANNEL = 2;
	static int DB_RIGHT_FRONT_CHANNEL = 3;
	static int GRABBER_CHANNEL = 4;
	static int GRABBER_ARM_CHANNEL = 5;
	static int LIFT_CHANNEL = 6;
	static int CLIMBER_CHANNEL = 7;
	static int GRABBER_SWITCH_CHANNEL = 8;
	
	// Speeds
	static double LIFT_UP_SPEED = 0.2;
	static double LIFT_DOWN_SPEED = -0.2;
	static double GRABBER_ARM_UP_SPEED = 0.2;
	static double GRABBER_ARM_DOWN_SPEED = 0.2;
	static double GRABBER_GRAB_SPEED = 0.5;
	static double GRABBER_LET_GO_SPEED = -0.5;
	static double GRABBER_HOLD_SPEED = 0.1;
	static double CLIMBER_UP_SPEED = 0.615;
	static double LIFT_COMPENSATE_SPEED = -0.2;
	
	// Times
	static int RAMP_UP_TIME_MS = 500;
}
