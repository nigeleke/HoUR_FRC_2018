package org.usfirst.frc.team6035.robot;
import edu.wpi.first.wpilibj.VictorSP;

public class DriveBaseV3 {
	VictorSP Left = new VictorSP(0);
	VictorSP Right = new VictorSP(1);
	
	public void drive(double speed, double direction) {
		if (speed == 1) {
		Left.set(1);
		Right.set(1);
		}
		else if (speed == 0) {
		Left.set(0);
		Right.set(0);
		}
		else if (speed == -1) {
		Left.set(-1);
		Right.set(-1);
		}
		else if (direction == 1) {
		Right.set(-speed);
		Left.set(speed);
		}
		else if (direction == 0) { 
		Right.set(speed);
		Left.set(speed);
		}
		else if (direction == -1) {
		Right.set(speed);
		Left.set(-speed);
		}
		}
}
