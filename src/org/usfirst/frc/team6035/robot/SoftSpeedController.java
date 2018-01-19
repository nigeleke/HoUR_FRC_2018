package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.*;

public class SoftSpeedController implements SpeedController {

	SpeedController target;
	Timer ssctimer = new Timer();
	
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
		speed = speedDiff/12.5 + target.get();
		target.set(speed);
		/*
		ssctimer.reset();
		if (ssctimer.get() < 0.48) {
			speed = speedDiff/25 + target.get();
			target.set(speed);
		}
		else if (ssctimer.get() == 0.48) {
			speed = speed + speedDiff;
			target.set(speed);
		}
		*/
	}
	
	@Override
	public double get() {
		// TODO Auto-generated method stub
		return target.get();
	}

	@Override
	public void setInverted(boolean isInverted) {
		// TODO Auto-generated method stub
		if(isInverted == true) {
			target.set(target.get()*-1);
		}
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
