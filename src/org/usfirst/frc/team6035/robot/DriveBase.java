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
	
	
	public void drive(double speed, double direction) {
		System.out.println(speed+" "+direction);
		right.set(speed);
		return;
		/*
	    if((speed != 0) && (direction == 0)){
	    	// Driving straight forward
	        left.set(speed);
	        right.set(speed);
	        System.out.println("Driving straight");
	    }
		if ((speed == 0) && (direction > 0)){
			// Turning right stationary
			left.set(direction);
			right.set(-direction);
			System.out.println("Turning while stationary");
		}
		if ((speed > 0) && (direction > 0)) {
			// Turning right with speed
			left.set(speed);
			right.set(-direction);
			System.out.println("Turning right with speed");
		}
		if ((speed > 0) && (direction < 0)) {
			// Turning left with speed
			left.set(direction);
			right.set(speed);
			System.out.println("Turning left with speed");
		}
		if ((speed < 0) && (direction > 0)) {
			// Turning right in reverse
			left.set(-direction);
			right.set(speed);
			System.out.println("Turning right while reversing");
		}
		if ((speed < 0) && (direction < 0)) {
			// Turning left in reverse
			left.set(speed);
			right.set(direction);
			System.out.println("Turning left while reversing");
		}
		*/
	}

}
