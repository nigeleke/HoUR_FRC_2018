package org.usfirst.frc.team6035.robot.auto;


public class LeftToLeftSwitch extends AutoDirection {
	public LeftToLeftSwitch() {
		turtle.forward(2.2)
		.turn(-25)
		.forward(2)
		.turn(45)
		.forward(1)
		.turn(90)
		.forward(0.1);
	}
}