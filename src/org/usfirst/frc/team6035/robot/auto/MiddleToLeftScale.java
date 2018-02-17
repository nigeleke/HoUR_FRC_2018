package org.usfirst.frc.team6035.robot.auto;


public class MiddleToLeftScale extends AutoDirection {
	public MiddleToLeftScale() {
	turtle.forward(0.2)
	.turn(-45)
	.forward(4.8)
	.turn(45)
	.forward(7.5)
	.turn(90)
	.forward(1.2);
	}
}