package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.VictorSP;

public class DriveBaseOG {
	VictorSP Left = new VictorSP(0);
	VictorSP Right = new VictorSP(1);

	public void drive(double speed, double direction) {
		if (direction == 0) {
			Left.set(speed);
			Right.set(speed);
			System.out.print("flag 1");
		}
		if (direction == 1) {
			Left.set(1);
			Right.set(-1);
			System.out.print("flag 2");
		}
		if (direction == -1) {
			Left.set(-1);
			Right.set(1);
			System.out.print("flag 3");
		}
		if ((direction == 0.5) && (speed != 0)) {
			Left.set(speed);
			Right.set(0);
			System.out.print("flag 4");
		}
		if ((direction == -0.5) && (speed != 0)) {
			Left.set(0);
			Right.set(speed);
			System.out.print("flag 5");
		}
		if ((direction == 0.5) && (speed == 0)) {
			Left.set(1);
			Right.set(0);
			System.out.print("flag 6");
		}
		if ((direction == -0.5) && (speed == 0)) {
			Left.set(0);
			Right.set(1);
			System.out.print("flag 7");
		}
		
		if ((direction > 0) && (direction < 0.5) && (speed != 0)){
			Left.set(speed);
			Right.set(direction * 2);
			System.out.print("flag 8");
		}
		if ((direction < 0) && (direction > -0.5) && (speed != 0)){
			Left.set(direction * 2);
			Right.set(speed);
			System.out.print("flag 9");
		}
		if ((direction > 0) && (direction < 0.5) && (speed == 0)){
			Left.set(speed);
			Right.set(direction * 2);
			System.out.print("flag 10");
		}
		if ((direction < 0) && (direction > -0.5) && (speed == 0)){
			Left.set(direction * 2);
			Right.set(speed);
			System.out.print("flag 11");
		}
		if ((direction > 0.5) && (speed == 0) && (direction != 1)){
			Left.set(direction);
			Right.set(((direction-0.5)/0.5)*-1);
			System.out.print("flag 12");
		}
		if ((direction < -0.5) && (speed == 0) && (direction != -1)){
			Left.set(((direction+0.5)/0.5)*-1);
			Right.set(direction);
			System.out.print("flag 13");
		}
		if ((direction > 0.5) && (speed != 0) && (direction != 1)){
			Left.set(speed);
			Right.set(((direction-0.5)/0.5)*-1);
			System.out.print("flag 14");
		}
		if ((direction < -0.5) && (speed != 0) && (direction != -1)){
			Left.set(((direction+0.5)/0.5));
			Right.set(speed);
			System.out.print("flag 15");
		}
		
		
		
		
	}
}
