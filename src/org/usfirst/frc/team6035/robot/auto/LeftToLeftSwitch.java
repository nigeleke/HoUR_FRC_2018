package org.usfirst.frc.team6035.robot.auto;


public class LeftToLeftSwitch extends AutoDirection {
	public LeftToLeftSwitch() {
		turtle.forward(4.2)
		.turn(90)
		.forward(0.8);
	}
}