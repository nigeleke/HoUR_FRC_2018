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
		double leftSpeed = direction.leftSpeed(stepNumber) * direction.Compensation();
		double rightSpeed = direction.rightSpeed(stepNumber) * direction.Compensation();

		driveBase.autonomousDrive(leftSpeed, rightSpeed);
		stepNumber++;
	}

	@Override
	public boolean isFinished() {
		return (stepNumber == direction.nSteps());
	}
}
