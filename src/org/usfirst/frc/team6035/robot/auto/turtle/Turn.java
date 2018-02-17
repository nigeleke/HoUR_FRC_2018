package org.usfirst.frc.team6035.robot.auto.turtle;

public class Turn implements TurtleStep{

	double degrees;
	
	public Turn(double degrees) {
		this.degrees = degrees;
	}
	
	@Override
	public int nSteps() {
		double rightAngleSteps = 200; // TODO Insert amount of steps required to turn 90 degrees
		return (int)Math.abs(rightAngleSteps * degrees / 90.0);
	}

	@Override
	public double leftSpeed() {
		double speed = 0.485;
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
