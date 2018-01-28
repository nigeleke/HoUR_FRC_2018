package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.Config;

public class RightToLeftScale extends AutoDirection {

	public RightToLeftScale() {
		super(Config.RIGHT_TO_LEFT_COMPENSATION);
	}

	private double[] leftMotorSpeeds = { 0.0 };

	private double[] rightMotorSpeeds = { 0.0 };

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
