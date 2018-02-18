package org.usfirst.frc.team6035.robot.controller;

import org.usfirst.frc.team6035.robot.auto.AutoPlay;
import org.usfirst.frc.team6035.robot.auto.AutoPlayGroup;
import org.usfirst.frc.team6035.robot.controller.operations.*;

public class AutonomousController implements Controller {
	private AutoPlayGroup autoPlayGroup;
	private int currentIndex = 0;
	private AutoPlay currentAutoPlay;
	private RobotOperations currentOperation;

	public AutonomousController(AutoPlayGroup autoPlayGroup) {
		this.autoPlayGroup = autoPlayGroup;
		currentAutoPlay = autoPlayGroup.get(0);
		System.out.println("cAP1: "+ currentAutoPlay);
		currentAutoPlay.init();
		System.out.println("cAP2: "+ currentAutoPlay);
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
	public LiftOperation getLiftOperation() {
		if (currentOperation == null) {
			return LiftOperation.STOP;
		} else {
			return currentOperation.liftOperation;
		}
	}

	@Override
	public ClimberOperation getClimberOperation() {
		return ClimberOperation.STOP;
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
			System.out.println("NextCycle1");
			currentOperation = currentAutoPlay.next();
			System.out.println("NextCycle2");
		} else {
			currentIndex++;
			if (currentIndex >= autoPlayGroup.size()) {
				currentOperation = null;
			} else {
				currentAutoPlay = autoPlayGroup.get(currentIndex);
				currentAutoPlay.init();
				System.out.println("NextCycle3");
				currentOperation = currentAutoPlay.next();
				System.out.println("NextCycle4");
			}
		}
	}

}
