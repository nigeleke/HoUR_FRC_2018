package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.*;

/**
 * @author Gabriel Love
 * Class for operating the drive base
 */

public class DriveBase  {
	// Sparks
	
	private Spark Backleft = new Spark(Config.DB_LEFT_BACK_CHANNEL);
	private Spark Frontleft = new Spark(Config.DB_LEFT_FRONT_CHANNEL);
	private Spark Backright = new Spark(Config.DB_RIGHT_BACK_CHANNEL);
	private Spark Frontright = new Spark(Config.DB_RIGHT_FRONT_CHANNEL);
	
	
	/**
	 * Motor group for left side
	 */
	
	private SpeedController left = new SoftSpeedController( new SpeedControllerGroup(Backleft, Frontleft));
	
	/**
	 * Motor group for right side 
	 */
	
	private SpeedController right = new SoftSpeedController(new SpeedControllerGroup(Backright, Frontright));
	
	
	/**
	 * @author Gabriel Love
	 * @param speed = the the value returned by the y axis on the joystick
	 * @param direction = the value returned by the x axis on the joystick
	 */
	public void drive(double speed, double direction) {

		double deltaSpeed = (speed >= 0.0 ? (Math.atan(speed/direction)*2)-1:(Math.atan(speed/direction)*2)+1);
	    double newLeftSpeed = (speed >= 0.0 ? speed*deltaSpeed:speed*-deltaSpeed);
	    double newRightSpeed = (speed >= 0.0 ? speed*-deltaSpeed:speed*deltaSpeed);
	    
	    left.set(newLeftSpeed);
	    right.set(newRightSpeed);
	    
	    System.out.println("Speed Left: " + newLeftSpeed + " Speed Right " + newRightSpeed);
		
	}

}
