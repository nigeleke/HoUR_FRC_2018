package org.usfirst.frc.team6035.robot.auto;


public class RightToLeftSwitch extends AutoDirection {
	public RightToLeftSwitch() {
		turtle.forward(5.8)
		.turn(-90)
		.forward(6)
		.turn(-90)
		.forward(1.6)
		.turn(-90)
		.forward(0.8);
	}
}
