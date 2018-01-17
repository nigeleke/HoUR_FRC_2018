package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.*;

public class SoftSpeedController implements SpeedController {

	SpeedController target;
	
	public SoftSpeedController(SpeedController target) {
	this.target = target;	
	}

	@Override
	public void pidWrite(double output) {
		// TODO Auto-generated method stub
	target.pidWrite(output);
		
	}

	@Override
	public void set(double speed) {
		double speedDiff = speed - target.get();
		double responseTime = 500;
		double cycles = responseTime/20;
		if (speedDiff < 0.05) {
			speed = target.get() + speedDiff;
		}
		else {
			speed = speedDiff/cycles + target.get();
		}
	}

	@Override
	public double get() {
		// TODO Auto-generated method stub
		return target.get();
	}

	@Override
	public void setInverted(boolean isInverted) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getInverted() {
		return target.getInverted();
	}

	@Override
	public void disable() {
		target.disable();
	}

	@Override
	public void stopMotor() {
		target.stopMotor();
	}
}
