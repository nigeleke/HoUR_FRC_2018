package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.Config;

public class RightToRightScale extends AutoDirection{
	public RightToRightScale() {
		super(Config.RIGHT_TO_RIGHT_COMPENSATION);	
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
