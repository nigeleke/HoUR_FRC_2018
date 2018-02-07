package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.Config;

public class DriveStraight extends AutoDirection{
	
	public DriveStraight() {
		super(Config.DRIVE_STRAIGHT_SPEED_COMPENSATION);	
	}
	
	@Override
	public int nSteps() {
		return 217;
	}

	@Override
	public double leftSpeed(int i) {
		return 0.164;
	}

	@Override
	public double rightSpeed(int i) {
		return 0.164;
	}
	
}

