package org.usfirst.frc.team6035.robot;

/**
 * Provides hardware configuration for the RoboRio channels
 * @author Gabe Love
 * Edited by = Ethan Sigler
 */
public class Config {

	// Ports 
	public static int JOYSTICK_PORT = 0;
	public static int XBOX_PORT = 1;

	
	// Channels
	public static int DB_LEFT_BACK_CHANNEL = 0;
	public static int DB_LEFT_FRONT_CHANNEL = 1;
	public static int DB_RIGHT_BACK_CHANNEL = 2;
	public static int DB_RIGHT_FRONT_CHANNEL = 3;
	public static int GRABBER_CHANNEL = 4;
	public static int GRABBER_ARM_CHANNEL = 5;
	public static int LIFT_CHANNEL = 6;
	public static int CLIMBER_CHANNEL = 7;
	public static int GRABBER_SWITCH_CHANNEL = 8;
	
	// Speeds
<<<<<<< HEAD
	public static double LIFT_UP_SPEED = 0.2;
	public static double LIFT_DOWN_SPEED = -0.2;
	public static double GRABBER_ARM_UP_SPEED = 0.2;
	public static double GRABBER_ARM_DOWN_SPEED = 0.2;
	public static double GRABBER_GRAB_SPEED = 0.75;
	public static double GRABBER_LET_GO_SPEED = -0.75;
	public static double GRABBER_HOLD_SPEED = 0.1;
	public static double CLIMBER_UP_SPEED = 0.615;
	public static double LIFT_COMPENSATE_SPEED = -0.2;
=======
	static double LIFT_UP_SPEED = 0.5;
	static double LIFT_DOWN_SPEED = -0.5;
	static double GRABBER_ARM_UP_SPEED = 0.2;
	static double GRABBER_ARM_DOWN_SPEED = 0.2;
	static double GRABBER_GRAB_SPEED = 0.75;
	static double GRABBER_LET_GO_SPEED = -0.75;
	static double GRABBER_HOLD_SPEED = 0.1;
	static double CLIMBER_UP_SPEED = 0.615;
	static double LIFT_COMPENSATE_SPEED = -0.2;
>>>>>>> e1242ee14811ebd7744461428d6074df3ab2ab0e
	
	// Times
	public static int RAMP_UP_TIME_MS = 500;
}
