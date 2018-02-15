package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.auto.turtle.Turtle;
import org.usfirst.frc.team6035.robot.auto.turtle.TurtleStep;
import org.usfirst.frc.team6035.robot.gamecomponents.tele.DriveBase;

/**
 * autonomous for base paths
 * @author SKI
 *
 */
public abstract class AutoDirection {

	protected Turtle turtle = new Turtle();
	private int turtleNumber;
	private int stepNumber;

	

	public void init() {

		turtleNumber = 0;
		stepNumber = 0;

	}

	

	public void doNextAction(DriveBase driveBase) {

		TurtleStep step = turtle.step(turtleNumber);

		double leftSpeed = step.leftSpeed();

		double rightSpeed = step.rightSpeed();

		driveBase.autonomousDrive(leftSpeed, rightSpeed);

		stepNumber++;

		if (stepNumber >= step.nSteps()) {

			stepNumber = 0;

			turtleNumber++;

		}

	}

	

	public boolean isFinished() {

		return turtleNumber >= turtle.nSteps();

	}

	
}
