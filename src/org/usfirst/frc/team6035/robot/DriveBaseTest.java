package org.usfirst.frc.team6035.robot;


public class DriveBaseTest {
double Left = 0;
double Right = 0;

	public void drive(double speed, double direction) {
		if (direction == 0) {
			Left = speed;
			Right = speed;
		}
		if (direction == 1) {
			Left = 1;
			Right = -1;
		}
		if (direction == -1) {
			Left = -1;
			Right = 1;
		}
		if ((direction == 0.5) && (speed != 0)) {
			Left = speed;
			Right = 0;
		}
		if ((direction == -0.5) && (speed != 0)) {
			Left = 0;
			Right = speed;
		}
		if ((direction == 0.5) && (speed == 0)) {
			Left = 1;
			Right = 0;
		}
		if ((direction == -0.5) && (speed == 0)) {
			Left = 0;
			Right = 1;
		}
		if ((direction > 0) && (direction < 50) && (speed != 0)){
			Left = speed;
			Right = (direction * 2);
		}
		if ((direction < 0) && (direction > -50) && (speed != 0)){
			Left = (direction * 2);
			Right = (speed);
		}
		if ((direction > 0) && (direction < 50) && (speed == 0)){
			Left = (direction);
			Right = (direction * 2);
		}
		if ((direction < 0) && (direction > -50) && (speed == 0)){
			Left = (direction * 2);
			Right = (direction);
		}
		if ((direction > 50) && (speed == 0) && (direction != 1)){
			Left = (direction);
			Right = (((direction-0.5)/0.5)*-1);
		}
		if ((direction < -50) && (speed == 0) && (direction != 1)){
			Left = (((direction-0.5)/0.5)*-1);
			Right = (direction);
		}
		if ((direction > 50) && (speed != 0) && (direction != 1)){
			Left = (speed);
			Right = (((direction-0.5)/0.5)*-1);
		}
		if ((direction < -50) && (speed != 0) && (direction != 1)){
			Left = (((direction-0.5)/0.5)*-1);
			Right = (speed);
		}
		
		
	
	}
public void test() {
		drive(0, 1);
		System.out.print(Left);
		System.out.print(Right);
}	
}
