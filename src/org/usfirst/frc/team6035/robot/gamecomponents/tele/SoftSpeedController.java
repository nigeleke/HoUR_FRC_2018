package org.usfirst.frc.team6035.robot.gamecomponents.tele;

import org.usfirst.frc.team6035.robot.*;

import edu.wpi.first.wpilibj.*;

/**
 * @author Ethan Sigler Gradual acceleration of motors
 */
class SoftSpeedController implements SpeedController {

	private SpeedController target;
	private int rampUpTimeMs;

	public SoftSpeedController(SpeedController target, int rampUpTimeMs) {
		this.target = target;
		this.rampUpTimeMs = rampUpTimeMs;
	}

	public SoftSpeedController(SpeedController target) {
		this(target, Config.RAMP_UP_TIME_MS);
	}

	@Override
	public void pidWrite(double output) {
		target.pidWrite(output);
	}

	@Override
	public void set(double speed) {
		double numberIterations = rampUpTimeMs / 20.0;
		double deltaSpeed = 1 / numberIterations;
		double currentSpeed = target.get();

		if (speed >= currentSpeed) {
			double proposedNewSpeed = currentSpeed + deltaSpeed;
			double actualNewSpeed = Math.min(proposedNewSpeed, speed);
			target.set(actualNewSpeed);
		} else {
			double proposedNewSpeed = currentSpeed - deltaSpeed;
			double actualNewSpeed = Math.max(proposedNewSpeed, speed);
			target.set(actualNewSpeed);
		}

	}

	@Override
	public double get() {
		return target.get();
	}

	@Override
	public void setInverted(boolean isInverted) {
		target.setInverted(isInverted);
	}

	@Override
	public boolean getInverted() {
		return target.getInverted();
	}

	@Override
	public void disable() {
		target.disable();
	}

	@Override
	public void stopMotor() {
		target.stopMotor();
	}
}
