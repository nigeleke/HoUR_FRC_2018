package org.usfirst.frc.team6035.robot.gamecomponents.auto;

import org.usfirst.frc.team6035.robot.gamecomponents.tele.*;
import org.usfirst.frc.team6035.robot.auto.*;

public class AutonomousDrive implements AutoCommand {
	
	private DriveBase driveBase;
	private AutoDirection direction;
	private int stepNumber;

	public AutonomousDrive(DriveBase driveBase, AutoDirection direction) {
		this.driveBase = driveBase;
		this.direction = direction;
	}

	@Override
	public void init() {
		stepNumber = 0;
	}

	@Override
	public void doNextAction() {
		double leftSpeedFtPerSec = direction.leftSpeed(stepNumber);
		double rightSpeedFtPerSec = direction.rightSpeed(stepNumber);
		
		double leftControllerSpeed =   (0.288 * Math.log(leftSpeedFtPerSec) + 0.4);
		double rightControllerSpeed = (0.288 * Math.log(rightSpeedFtPerSec) + 0.4);

		driveBase.autonomousDrive(leftControllerSpeed, rightControllerSpeed);
		stepNumber++;
	}

	@Override
	public boolean isFinished() {
		return (stepNumber == direction.nSteps());
	}
}
