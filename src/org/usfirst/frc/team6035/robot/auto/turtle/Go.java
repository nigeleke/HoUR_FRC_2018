package org.usfirst.frc.team6035.robot.auto.turtle;

public class Go implements TurtleStep {
	
	private double nMetres;
	
	public Go(double nMetres) {
		this.nMetres = nMetres;
	}

	/**************************************************************************
	 * These number need tuning - but I think they should be close (judging
	 * from the speed tests). Suggest you keep speed as-is and reduce nSteps if
	 * overshooting.
	 */
	
	@Override
	public int nSteps() {
		double x = 19.25; // TODO - number of steps to travel exactly one metre...
		return (int)(x * nMetres);
	}

	@Override
	public double leftSpeed() {
		double speed = 0.9; // TODO - Pick constant controller speed (between 0 & 1) - e.g. 0.75
		return speed;
	}

	@Override
	public double rightSpeed() {
		return leftSpeed(); // Same as left because this command goes straight only...
	}
}
