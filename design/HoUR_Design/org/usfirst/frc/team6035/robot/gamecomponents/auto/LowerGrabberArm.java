package org.usfirst.frc.team6035.robot.gamecomponents.auto;

import org.usfirst.frc.team6035.robot.Config;
import org.usfirst.frc.team6035.robot.gamecomponents.tele.*;

public class LowerGrabberArm implements AutoCommand {

	private GrabberArm grabberArm;
	private int stepNumber;

	public LowerGrabberArm(GrabberArm grabberArm) {
		this.grabberArm = grabberArm;
	}

	@Override
	public void init() {
		stepNumber = 0;
	}

	@Override
	public void doNextAction() {
		grabberArm.down();
		stepNumber++;
	}

	@Override
	public boolean isFinished() {
		return (stepNumber == Config.LOWER_GRABBER_ARM_STEPS);
	}

}
