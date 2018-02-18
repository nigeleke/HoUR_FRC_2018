package org.usfirst.frc.team6035.robot.auto;


public class RightToLeftSwitch extends AutoDirection {
	public RightToLeftSwitch() {
		turtle.forward(-1.75, 0.8)
		.turn(27, 0.55)
		.forward(-2.22, 0.76)
		.turn(27, 0.55)
		.forward(-1.1, 0.7)
		.turn(27, 0.55)
		.forward(-0.1, 0.55);
	}
}
