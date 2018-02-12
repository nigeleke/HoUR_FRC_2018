package org.usfirst.frc.team6035.robot.auto;

public class LeftToLeftScale extends AutoDirection {

	public LeftToLeftScale() {
		// TODO: Set correct path,,,
		turtle = turtle
				.forward(1)
				.turn(-45)
				.forward(2)
				.turn(45)
				.forward(.5)
				.turn(90)
				.forward(1.0);
	}

}
