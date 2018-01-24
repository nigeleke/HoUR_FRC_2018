package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.Config;

public class DriveStraight extends AutoDirection{
	
	public DriveStraight() {
		super(Config.DRIVE_STRAIGHT_COMPENSATION);	
		}

	
	@Override
	public int nSteps() {
		return 217;
	}

	@Override
	public double LeftSpeed(int i) {
		return 0.164;
	}

	@Override
	public double RightSpeed(int i) {
		return 0.164;
	}
	
}

