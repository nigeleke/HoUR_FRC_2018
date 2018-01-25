package org.usfirst.frc.team6035.robot;

/**
 * Provides hardware configuration for the RoboRio channels
 * @author Gabe Love
 * Edited by = Ethan Sigler
 */
public class Config {

	//Game Parameters
	public static int GAME_TIME_S = 150;
	public static int CLIMB_ENABLED_TIME_S = GAME_TIME_S - 30;
	
	// Ports 
	public static int JOYSTICK_PORT = 0;
	public static int XBOX_PORT = 1;

	
	// Channels
	public static int DB_LEFT_BACK_CHANNEL = 0;
	public static int DB_LEFT_FRONT_CHANNEL = 1;
	public static int DB_RIGHT_BACK_CHANNEL = 2;
	public static int DB_RIGHT_FRONT_CHANNEL = 3;
	public static int GRABBER_CHANNEL = 7;
	public static int GRABBER_ARM_CHANNEL = 5;
	public static int LIFT_CHANNEL = 6;
	public static int CLIMBER_CHANNEL = 4;
	public static int GRABBER_SWITCH_CHANNEL_DIO = 0;
	
	// Speeds
	public static double LIFT_UP_SPEED = 0.5;
	public static double LIFT_DOWN_SPEED = -0.5;
	public static double GRABBER_ARM_UP_SPEED = 0.2;
	public static double GRABBER_ARM_DOWN_SPEED = 0.2;
	public static double GRABBER_GRAB_SPEED = 0.75;
	public static double GRABBER_LET_GO_SPEED = -0.75;
	public static double GRABBER_HOLD_SPEED = 0.1;
	public static double CLIMBER_UP_SPEED = 0.615;
	public static double LIFT_COMPENSATE_SPEED = -0.2;

	
	// Times
	public static int RAMP_UP_TIME_MS = 500;
	
	
	// Autonomous Speed Compensation
	public static double LEFT_TO_LEFT_COMPENSATION = 3.5;
	public static double LEFT_TO_RIGHT_COMPENSATION = 1.0;
	public static double MIDDLE_TO_LEFT_COMPENSATION = 2.8;
	public static double MIDDLE_TO_RIGHT_COMPENSATION = 2.8;
	public static double RIGHT_TO_RIGHT_COMPENSATION = 4.0;
	public static double RIGHT_TO_LEFT_COMPENSATION = 1.5;
	public static double DRIVE_STRAIGHT_COMPENSATION = 5;
	
	//Autonomous Steps
	public static int DROP_CUBE_STEPS = 50;
	public static int GRAB_CUBE_STEPS = 50;
	public static int LIFT_TO_SWITCH_POSITION_STEPS = 100;
	public static int LOWER_GRABBER_ARM_STEPS = 75;
	public static int LOWER_GRABBER_ARM_TO_DROP_POSITION_STEPS = 75;
	public static int RAISE_GRABBER_ARM_TO_DRIVE_POSITION = 225;
}
