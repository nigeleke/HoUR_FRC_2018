package org.usfirst.frc.team6035.robot.auto.turtle;

public class Turn implements TurtleStep{

	double degrees;
	
	public Turn(double degrees) {
		this.degrees = degrees;
	}
	
	@Override
	public int nSteps() {
		double rightAngleSteps = 3.5; // TODO Insert amount of steps required to turn 90 degrees
		return (int)(rightAngleSteps * degrees / 90.0);
	}

	@Override
	public double leftSpeed() {
		double speed = 0.56;
		if(degrees < 0) {
			return -speed;
		}
		else {
			return speed;
		}
	}

	@Override
	public double rightSpeed() {
		return -leftSpeed();
	}

}
