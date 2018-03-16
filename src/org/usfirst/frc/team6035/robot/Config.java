package org.usfirst.frc.team6035.robot;


/**
 * Provides hardware configuration for the RoboRio channels
 * 
 * @author Gabe Love Edited by = Ethan Sigler
 */
public class Config {

	// Game Parameters
	public static int GAME_TIME_S = 150;
	public static int AUTO_TIME = 15;
	public static int TELE_OP_TIME = GAME_TIME_S - AUTO_TIME;
	public static int CLIMBER_DISABLED_TIME = TELE_OP_TIME - 30;

	// Ports
	public static int JOYSTICK_PORT = 0;
	public static int XBOX_PORT = 1;

	// Channels
	public static int DB_LEFT_BACK_CHANNEL = 0;
	public static int DB_LEFT_FRONT_CHANNEL = 1;
	public static int DB_RIGHT_BACK_CHANNEL = 2;
	public static int DB_RIGHT_FRONT_CHANNEL = 3;
	public static int GRABBER_CHANNEL = 7 ;
	public static int GRABBER_ARM_CHANNEL = 4;
	public static int LIFT_CHANNEL = 6;
	public static int CLIMBER_CHANNEL = 5;
	public static int PUSHER_CHANNEL = 8;
	
	// Digital I/O
	public static int GRABBER_SWITCH_CHANNEL_DIO = 7;
	public static int LIFT_UP_TRAVEL_DIO = 0;
	public static int LIFT_DOWN_TRAVEL_DIO = 3;
	public static int GRABBER_ARM_UP_DIO = 5;

	// Speeds
	public static double LIFT_UP_SPEED = 0.55;
	public static double LIFT_DOWN_SPEED = -0.5;
	public static double GRABBER_ARM_UP_SPEED = -0.4;
	public static double GRABBER_ARM_DOWN_SPEED = 0.4;
	public static double GRABBER_GRAB_SPEED = 0.9;
	public static double GRABBER_LET_GO_SPEED = -0.9;
	public static double GRABBER_HOLD_SPEED = 0.1;
	public static double CLIMBER_UP_SPEED = -0.75;
	public static double CLIMBER_DOWN_SPEED = 0.75;
	public static double LIFT_COMPENSATE_SPEED = -0.2;
	public static double PUSHER_PUSH_SPEED = 0.35;
	public static double PUSHER_REWIND_SPEED = -0.35;

	// Times
	public static int DEFAULT_RAMP_UP_TIME_MS = 500;
	public static int LIFT_UP_RAMP_UP_TIME_MS = 3000;

	// Misc.
	public static double DIRECTION_SENSITIVITY = 0.6;

}
