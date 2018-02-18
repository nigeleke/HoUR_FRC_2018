package org.usfirst.frc.team6035.robot.auto;


public class LeftToRightSwitch extends AutoDirection {

	public LeftToRightSwitch() {
		turtle.forward(-1.8, 0.8)
		.turn(25, 0.55)
		.forward(-2.2, 0.76)
		.turn(25, 0.55)
		.forward(-0.85, 0.7)
		.turn(22, 0.55)
		.forward(-0.1, 0.55);
	}

}
