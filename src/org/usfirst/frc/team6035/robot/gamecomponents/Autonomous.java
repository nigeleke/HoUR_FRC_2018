package org.usfirst.frc.team6035.robot.gamecomponents;

import edu.wpi.first.wpilibj.IterativeRobot;
import org.usfirst.frc.team6035.robot.auto.*;

public class Autonomous extends IterativeRobot {
	private DriveBase driveBase;
	
	public Autonomous(DriveBase driveBase) {
		this.driveBase = driveBase;
	}
	
	public void drive(AutoDirection direction) {
		for (int i = 0; i < direction.nSteps(); i++) {
			driveBase.autonomousDrive(direction.LeftSpeed(i)*direction.Compensation(), direction.RightSpeed(i)*direction.Compensation());
		}
	}
}
