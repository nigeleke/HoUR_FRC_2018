package org.usfirst.frc.team6035.robot.auto;


public class LeftToRightScale extends AutoDirection {
	public LeftToRightScale() {
		turtle.forward(-1.75, 0.8)
		.turn(-32, 0.55)
		.forward(-2.25, 0.76)
		.turn(27, 0.55)
		.forward(-1.15, 0.7)
		.turn(27, 0.55);
		//TODO Finalise values
	}
}
