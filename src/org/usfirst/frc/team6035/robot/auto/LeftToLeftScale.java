package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.*;

public class LeftToLeftScale extends AutoDirection {
	
	public LeftToLeftScale() {
	super(Config.LEFT_TO_LEFT_COMPENSATION);	
	}
	
	double[] LeftMotorSpeeds = {
			
	};
	
	double[] RightMotorSpeeds = {
			
	};
	
	public int nSteps() {
		return LeftMotorSpeeds.length;
	}
	
	public double LeftSpeed(int i) {
		return LeftMotorSpeeds[i];
	}
	public double RightSpeed(int i) {
		return RightMotorSpeeds[i];
	}

}
