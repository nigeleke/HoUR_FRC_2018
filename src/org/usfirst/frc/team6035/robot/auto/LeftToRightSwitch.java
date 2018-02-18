package org.usfirst.frc.team6035.robot.auto;


public class LeftToRightSwitch extends AutoDirection {

	public LeftToRightSwitch() {
		turtle.forward(-1.75, 0.8)
		.turn(-29, 0.55)
		.forward(-2.05, 0.76)
		.turn(-30, 0.55)
		.forward(-0.8, 0.7)
		.turn(-30, 0.55)
		.forward(-0.1, 0.55);
	}

}
