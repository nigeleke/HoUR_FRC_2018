package org.usfirst.frc.team6035.robot.controller;

import org.usfirst.frc.team6035.robot.auto.AutoPlay;
import org.usfirst.frc.team6035.robot.auto.AutoPlayGroup;
import org.usfirst.frc.team6035.robot.controller.operations.*;

public class AutonomousController implements Controller {
	private AutoPlayGroup autoPlayGroup;
	private int currentIndex = 0;
	private AutoPlay currentAutoPlay;
	public RobotOperations currentOperation;

	public AutonomousController(AutoPlayGroup autoPlayGroup) {
		this.autoPlayGroup = autoPlayGroup;
		currentAutoPlay = autoPlayGroup.get(0);
		currentAutoPlay.init();
		currentOperation = currentAutoPlay.next();
	}

	@Override
	public double getDriveSpeed() {
		if (currentOperation == null) {
			return 0;
		} else {
			return currentOperation.driveSpeed;
		}
	}

	@Override
	public double getDriveDirection() {
		if (currentOperation == null) {
			return 0;
		} else {
			return currentOperation.driveDirection;
		}
	}

	@Override
	public GrabberOperation getGrabberOperation() {
		if (currentOperation == null) {
			return GrabberOperation.STOP;
		} else {
			return currentOperation.grabberOperation;
		}
	}

	@Override
	public GrabberArmOperation getGrabberArmOperation() {
		if (currentOperation == null) {
			return GrabberArmOperation.STOP;
		} else {
			return currentOperation.grabberArmOperation;
		}
	}

	@Override
	public PushOperation getPushOperation() {
		if (currentOperation == null) {
			return PushOperation.STOP;
		} else {
			return currentOperation.pushOperation;
		}
	}

	@Override
	public void nextCycle() {
		if (!currentAutoPlay.isFinished()) {
			currentOperation = currentAutoPlay.next();
		} else {
			currentIndex++;
			if (currentIndex >= autoPlayGroup.size()) {
				currentOperation = null;
			} else {
				currentAutoPlay = autoPlayGroup.get(currentIndex);
				currentAutoPlay.init();
				currentOperation = currentAutoPlay.next();
			}
		}
	}

}
