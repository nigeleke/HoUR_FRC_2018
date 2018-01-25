package org.usfirst.frc.team6035.robot.gamecomponents.auto;

import org.usfirst.frc.team6035.robot.gamecomponents.tele.*;

public class Autonomous {

	private DriveBase driveBase;
	private GrabberArm grabberArm;
	private Grabber grabber;
	private Lift lift;
	
	public Autonomous(DriveBase driveBase, GrabberArm grabberArm, Grabber grabber, Lift lift) {
		this.driveBase = driveBase;
		this.grabberArm = grabberArm;
		this.grabber = grabber;
		this.lift = lift;
	}
	public void doNextAction(int autoCount) {
		
	}

}
