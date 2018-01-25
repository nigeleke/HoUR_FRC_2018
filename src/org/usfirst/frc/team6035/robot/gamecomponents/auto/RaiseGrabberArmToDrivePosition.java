package org.usfirst.frc.team6035.robot.gamecomponents.auto;

import org.usfirst.frc.team6035.robot.Config;
import org.usfirst.frc.team6035.robot.gamecomponents.tele.GrabberArm;

public class RaiseGrabberArmToDrivePosition implements AutoCommand{
	private GrabberArm grabberArm;
	private int stepNumber;
	
	public RaiseGrabberArmToDrivePosition(GrabberArm grabberArm) {
		this.grabberArm = grabberArm;
	}
	@Override
	public void init() {
		
		stepNumber = 0;
		
	}

	@Override
	public void doNextAction() {
		grabberArm.up();
		
	}

	@Override
	public boolean isFinished() {
		
		return (stepNumber == Config.RAISE_GRABBER_ARM_TO_DRIVE_POSITION);
	
	}

}
