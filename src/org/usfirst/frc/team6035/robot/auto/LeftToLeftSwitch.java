package org.usfirst.frc.team6035.robot.auto;


public class LeftToLeftSwitch extends AutoDirection {
	public LeftToLeftSwitch() {
		turtle.forward(4.5)
		.turn(100)
		.forward(0.1);
	}
}