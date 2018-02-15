package org.usfirst.frc.team6035.robot.gamecomponents.auto;

import org.usfirst.frc.team6035.robot.gamecomponents.tele.*;
import org.usfirst.frc.team6035.robot.auto.*;

public class AutonomousDrive implements AutoCommand {
	
	private DriveBase driveBase;
	private AutoDirection direction;

	public AutonomousDrive(DriveBase driveBase, AutoDirection direction) {
		this.driveBase = driveBase;
		this.direction = direction;
	}

	@Override
	public void init() {
		direction.init();
	}

	@Override
	public void doNextAction() {
		direction.doNextAction(driveBase);
	}

	@Override
	public boolean isFinished() {
		return direction.isFinished();
	}
}
