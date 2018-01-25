package org.usfirst.frc.team6035.robot.gamecomponents.auto;

import org.usfirst.frc.team6035.robot.Config;
import org.usfirst.frc.team6035.robot.gamecomponents.tele.*;

public class DropCube implements AutoCommand{
	private int stepNumber;
	private Grabber grabber;

	public DropCube(Grabber grabber) {
		this.grabber = grabber;
	}
	@Override
	public void init() {
		stepNumber = 0;
	}

	@Override
	public void doNextAction() {
		grabber.letgo();
	}

	@Override
	public boolean isFinished() {
		return (stepNumber == Config.DROP_CUBE_STEPS);
	}

}
