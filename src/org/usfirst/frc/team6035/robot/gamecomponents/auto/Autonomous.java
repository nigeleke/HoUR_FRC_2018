package org.usfirst.frc.team6035.robot.gamecomponents.auto;

import org.usfirst.frc.team6035.robot.auto.AutoDirection;
import org.usfirst.frc.team6035.robot.gamecomponents.tele.*;

public class Autonomous {

	private DriveBase driveBase;
	private GrabberArm grabberArm;
	private Grabber grabber;
	private Lift lift;
	
	
	private LowerGrabberArm lowerGrabberArm;
	private GrabCube grabCube;
	private RaiseGrabberArmToDrivePosition raiseGrabberArmToDrivePosition;
	private AutonomousDrive autoDrive;
	private LiftToSwitchPosition liftToSwitchPosition;
	private LowerGrabberArmToDropPosition lowerGrabberArmToDropPosition;
	private DropCube dropCube;
	
	
	public Autonomous(DriveBase driveBase, GrabberArm grabberArm, Grabber grabber, Lift lift, AutoDirection direction) {
		
		this.driveBase = driveBase;
		this.grabberArm = grabberArm;
		this.grabber = grabber;
		this.lift = lift;
		
		
		this.lowerGrabberArm = new LowerGrabberArm(grabberArm);
		this.grabCube = new GrabCube(grabber);
		this.raiseGrabberArmToDrivePosition = new RaiseGrabberArmToDrivePosition();
		this.autoDrive = new AutonomousDrive(driveBase, direction);
		this.liftToSwitchPosition = new LiftToSwitchPosition(lift);
		this.lowerGrabberArmToDropPosition = new LowerGrabberArmToDropPosition(grabberArm);
		this.dropCube = new DropCube(grabber);
	}
	public void doNextAction(int autoCount) {
		
	}

}
