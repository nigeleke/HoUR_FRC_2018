package org.usfirst.frc.team6035.robot.auto;

public class LeftToLeftScale extends AutoDirection {
	public LeftToLeftScale() {
		turtle.forward(-3.45, 0.7)
		.turn(70)
		.forward(-0.01, 0.48);
	}
}
