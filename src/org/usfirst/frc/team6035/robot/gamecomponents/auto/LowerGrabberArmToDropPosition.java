package org.usfirst.frc.team6035.robot.gamecomponents.auto;

import org.usfirst.frc.team6035.robot.Config;
import org.usfirst.frc.team6035.robot.gamecomponents.tele.*;

public class LowerGrabberArmToDropPosition implements AutoCommand {

	private GrabberArm grabberArm;
	private int stepNumber;

	public LowerGrabberArmToDropPosition(GrabberArm grabberArm) {
		this.grabberArm = grabberArm;
	}

	@Override
	public void init() {
		stepNumber = 0;
	}

	@Override
	public void doNextAction() {
		grabberArm.down();
	}

	@Override
	public boolean isFinished() {
		return (stepNumber == Config.LOWER_GRABBER_ARM_TO_DROP_POSITION_STEPS);
	}

}
