package org.usfirst.frc.team6035.robot.auto;


public class RightToRightScale extends AutoDirection {
	public RightToRightScale() {
		turtle.forward(3.45, 0.7)
		.turn(-50)
		.forward(0.01, 0.48);
	}
}
