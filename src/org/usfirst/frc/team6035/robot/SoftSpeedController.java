package org.usfirst.frc.team6035.robot;
import edu.wpi.first.wpilibj.*;

public class SoftSpeedController {
	
	Timer timer = new Timer();
	Joystick stick = new Joystick(0);
	
	public void SoftSpeedCont(SpeedControllerGroup motorGroup) {
		double speedCurr = motorGroup.get();
		double speedJoy = stick.getY();
		double speedDiff = speedJoy-speedCurr;
		double accelTime = 2;
		
		while (speedJoy != speedCurr) {
			motorGroup.set(speedCurr + speedDiff/accelTime);
			try {
				timer.wait((long) (speedDiff/accelTime));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
