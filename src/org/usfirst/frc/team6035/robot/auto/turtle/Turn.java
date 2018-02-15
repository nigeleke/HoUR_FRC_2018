package org.usfirst.frc.team6035.robot.auto.turtle;

public class Turn implements TurtleStep{

	double degrees;
	
	public Turn(double degrees) {
		this.degrees = degrees;
	}
	
	@Override
	public int nSteps() {
		double rightAngleSteps = 5; // TODO Insert amount of steps required to turn 90 degrees
		return (int)(degrees/rightAngleSteps);
	}

	@Override
	public double leftSpeed() {
		if(degrees < 0) {
			return -0.9;
		}
		else {
			return 0.9;
		}
	}

	@Override
	public double rightSpeed() {
		return -leftSpeed();
	}

}
