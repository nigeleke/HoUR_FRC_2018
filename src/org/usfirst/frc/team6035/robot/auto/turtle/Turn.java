package org.usfirst.frc.team6035.robot.auto.turtle;

public class Turn implements TurtleStep {
	
	double degrees;
	
	public Turn(int degrees) {
		this.degrees = (double)degrees;
	}

	/**************************************************************************
	 * These number need tuning - Suggest you keep speed as-is and change nSteps
	 * with a Turtle.turn(90) until robot turns exactly 90 degrees (right).
	 */
	
	@Override
	public int nSteps() {
		double x = 5; // TODO - Number of steps to turn exactly 90 degrees.
		return (int)(degrees / x);
	}

	@Override
	public double leftSpeed() {
		return 0.9;
	}

	@Override
	public double rightSpeed() {
		return -leftSpeed(); // Negative of left speed to spin on spot...
	}

}
