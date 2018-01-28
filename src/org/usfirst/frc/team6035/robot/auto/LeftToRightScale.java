package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.Config;

public class LeftToRightScale extends AutoDirection {

	public LeftToRightScale() {
		super(Config.LEFT_TO_RIGHT_COMPENSATION);
	}

	double[] leftMotorSpeeds = { 0.0 };

	double[] rightMotorSpeeds = { 0.0 };

	public int nSteps() {
		return leftMotorSpeeds.length;
	}

	public double leftSpeed(int i) {
		return leftMotorSpeeds[i];
	}

	public double rightSpeed(int i) {
		return rightMotorSpeeds[i];
	}

}
