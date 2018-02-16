package org.usfirst.frc.team6035.robot.auto.turtle;

public class Forward implements TurtleStep {
	
	private double nMetres;
	
	public Forward(double nMetres) {
		this.nMetres = nMetres;
	}
	@Override
	public int nSteps() {
		int metreSteps = 1; // TODO Enter amount of Steps required to travel 1 metre
		return (int)(metreSteps * nMetres);
	}

	@Override
	public double leftSpeed() {
		return -0.69;
	}

	@Override
	public double rightSpeed() {
		return leftSpeed();
	}
}
