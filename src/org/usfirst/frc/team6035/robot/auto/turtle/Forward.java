package org.usfirst.frc.team6035.robot.auto.turtle;

public class Forward implements TurtleStep {
	
	private double nMetres;
	private double speed = -0.54;
	
	public Forward(double nMetres) {
		this.nMetres = nMetres;
	}
	public Forward(double nMetres, double speed) {
		this.nMetres = nMetres;
		this.speed = speed;
	}
	@Override
	public int nSteps() {
		int metreSteps = 75; // TODO Enter amount of Steps required to travel 1 metre
		return (int)(metreSteps * nMetres);
	}

	@Override
	public double leftSpeed() {
		return speed;
	}

	@Override
	public double rightSpeed() {
		return leftSpeed();
	}
}
