package org.usfirst.frc.team6035.robot.auto;


public class RightToLeftScale extends AutoDirection {
	public RightToLeftScale() {
		turtle.forward(-5.8)
		.turn(90)
		.forward(-6)
		.turn(-90)
		.forward(-3)
		.turn(-90)
		.forward(-0.8);
		//TODO Mirror values from LeftToRightScale and finalise
	}
}