package org.usfirst.frc.team6035.robot.auto;


public class LeftToRightScale extends AutoDirection {
	public LeftToRightScale() {
		turtle.forward(5.8)
		.turn(90)
		.forward(6)
		.turn(-90)
		.forward(3)
		.turn(-90)
		.forward(0.8);
	}
}
