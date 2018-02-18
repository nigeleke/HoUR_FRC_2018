package org.usfirst.frc.team6035.robot.auto;


public class LeftToRightScale extends AutoDirection {
	public LeftToRightScale() {
		turtle.forward(-1.8, 0.8)
		.turn(25, 0.55)
		.forward(-2.2, 0.76)
		.turn(-20, 0.55)
		.forward(-0.9, 0.7)
		.turn(-5, 0.5)
		.forward(-0.1, 0.5);
	}
}
