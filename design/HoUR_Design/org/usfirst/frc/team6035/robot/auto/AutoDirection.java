package org.usfirst.frc.team6035.robot.auto;

public abstract class AutoDirection {
	private double compensation;

	public AutoDirection(double compensation) {
		this.compensation = compensation;
	}

	public abstract int nSteps();

	public abstract double leftSpeed(int i);

	public abstract double rightSpeed(int i);

	public double Compensation() {
		return compensation;
	}
}
