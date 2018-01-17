package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;

public class DriveBase  {
	// Sparks
	/*
	Spark BackLeft = new Spark(0);
	Spark FrontLeft = new Spark(1);
	Spark BackRight = new Spark(2);
	Spark FrontRight = new Spark(3);
	

	// Speed Controller Groups
	SpeedControllerGroup Left = new SpeedControllerGroup(BackLeft, FrontLeft);
	SpeedControllerGroup Right = new SpeedControllerGroup(BackRight, FrontRight);
	*/
	
	VictorSP Left = new VictorSP(0);
	VictorSP Right = new VictorSP(1);
	
	public void drive(double speed, double direction) {
	    if((speed != 0) && (direction == 0)){
	    	// Driving Straight Forward
	        Left.set(speed);
	        Right.set(speed);
	        System.out.print("driving straight");
	    }
		if ((speed == 0) && (direction > 0)){
			// Turning Right Stationary
			Left.set(direction);
			Right.set(-direction);
			System.out.print("flag 1");
		}
		if ((speed == 0) && (direction < 0)) {
			// Turning Left Stationary
			Left.set(direction);
			Right.set(-direction);
			System.out.print("flag 2");
		}
		if ((speed > 0) && (direction > 0)) {
			// Turning Right with Speed
			Left.set(speed);
			Right.set(-direction);
			System.out.print("flag 3");
		}
		if ((speed > 0) && (direction < 0)) {
			// Turning Left with Speed
			Left.set(direction);
			Right.set(speed);
			System.out.print("flag 4");
		}
		if ((speed < 0) && (direction > 0)) {
			// Turning Right in Reverse
			Left.set(-direction);
			Right.set(speed);
			System.out.print("flag 5");
		}
		if ((speed < 0) && (direction < 0)) {
			// Turning Left in Reverse
			Left.set(speed);
			Right.set(direction);
			System.out.print("flag 6");
		}
		
	}

}
