package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.Config;

public class MiddleToRightScale extends AutoDirection {

	public MiddleToRightScale() {
		super(Config.MIDDLE_TO_RIGHT_COMPENSATION);
	}

	double[] LeftMotorSpeeds = { 0.0 };

	double[] RightMotorSpeeds = { 0.0 };

	public int nSteps() {
		return LeftMotorSpeeds.length;
	}

	public double LeftSpeed(int i) {
		return LeftMotorSpeeds[i];
	}

	public double RightSpeed(int i) {
		return RightMotorSpeeds[i];
	}

}