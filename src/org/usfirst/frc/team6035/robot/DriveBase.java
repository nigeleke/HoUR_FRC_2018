package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.*;

/**
 * @author Gabriel Love
 * Class for operating the drive base
 */

public class DriveBase  {
	// Sparks
	
	private Spark BackLeft = new Spark(0);
	private Spark FrontLeft = new Spark(1);
	private Spark BackRight = new Spark(2);
	private Spark FrontRight = new Spark(3);
	
	
	/**
	 * Motor group for left side
	 */
	
	private SpeedControllerGroup Left = new SpeedControllerGroup(BackLeft, FrontLeft);
	
	/**
	 * Motor group for right side 
	 */
	
	private SpeedControllerGroup Right = new SpeedControllerGroup(BackRight, FrontRight);
	
	
	public void drive(double speed, double direction) {
	    if((speed != 0) && (direction == 0)){
	    	// Driving Straight Forward
	        Left.set(speed);
	        Right.set(speed);
	        System.out.print("Driving straight");
	    }
		if ((speed == 0) && (direction > 0)){
			// Turning Right Stationary
			Left.set(direction);
			Right.set(-direction);
			System.out.print("Turning right while stationary");
		}
		if ((speed == 0) && (direction < 0)) {
			// Turning Left Stationary
			Left.set(direction);
			Right.set(-direction);
			System.out.print("Turning left while stationary");
		}
		if ((speed > 0) && (direction > 0)) {
			// Turning Right with Speed
			Left.set(speed);
			Right.set(-direction);
			System.out.print("Turning right with speed");
		}
		if ((speed > 0) && (direction < 0)) {
			// Turning Left with Speed
			Left.set(direction);
			Right.set(speed);
			System.out.print("Turning left with speed");
		}
		if ((speed < 0) && (direction > 0)) {
			// Turning Right in Reverse
			Left.set(-direction);
			Right.set(speed);
			System.out.print("Turning right while reversing");
		}
		if ((speed < 0) && (direction < 0)) {
			// Turning Left in Reverse
			Left.set(speed);
			Right.set(direction);
			System.out.print("Turning left while reversing");
		}
		
	}

}
