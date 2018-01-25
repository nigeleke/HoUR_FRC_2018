package org.usfirst.frc.team6035.robot.gamecomponents.auto;

import edu.wpi.first.wpilibj.IterativeRobot;
import org.usfirst.frc.team6035.robot.gamecomponents.tele.*;
import org.usfirst.frc.team6035.robot.auto.*;

public class AutonomousDrive extends IterativeRobot {
	private DriveBase driveBase;
	
	public AutonomousDrive(DriveBase driveBase) {
		this.driveBase = driveBase;
	}
	
	public void drive(AutoDirection direction) {
		for (int i = 0; i < direction.nSteps(); i++) {
			driveBase.autonomousDrive(direction.LeftSpeed(i)*direction.Compensation(), direction.RightSpeed(i)*direction.Compensation());
		}
	}
}
