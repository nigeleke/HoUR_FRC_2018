package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.*;

public class LeftToLeftScale extends AutoDirection {

	public LeftToLeftScale() {
		super(Config.LEFT_TO_LEFT_SCALE_SPEED_COMPENSATION);
	}

	private double[] leftMotorSpeeds = { 0.0 };

	private double[] rightMotorSpeeds = { 0.0 };

	public int nSteps() {
		return leftMotorSpeeds.length;
	}

	public double leftSpeed(int i) {
		return (0.288 * Math.log(leftMotorSpeeds[i]) + 0.4);
	}
	public double rightSpeed(int i) {
		return (0.288 * Math.log(rightMotorSpeeds[i]) + 0.4);
	}

}
