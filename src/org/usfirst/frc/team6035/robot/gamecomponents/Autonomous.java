package org.usfirst.frc.team6035.robot.gamecomponents;

import edu.wpi.first.wpilibj.IterativeRobot;
import org.usfirst.frc.team6035.robot.auto.*;

public class Autonomous extends IterativeRobot {
	DriveBase driveBase = new DriveBase();
	LeftToLeft leftToLeft = new LeftToLeft();
	LeftToRight leftToRight = new LeftToRight();
	MiddleToLeft middleToLeft = new MiddleToLeft();
	MiddleToRight middleToRight = new MiddleToRight();
	RightToLeft rightToLeft = new RightToLeft();
	RightToRight rightToRight = new RightToRight();
	
	public void LeftToLeft() {
		for (int i = 0; i < leftToLeft.nSteps(); i++) {
			driveBase.autonomousDrive(leftToLeft.LeftSpeed(i)/9, leftToLeft.RightSpeed(i)/9);
			System.out.println(leftToLeft.LeftSpeed(i)/9);
		}
	}
	public void LeftToRight() {
		for (int i = 0; i < leftToRight.nSteps(); i++) {
			driveBase.autonomousDrive(leftToRight.LeftSpeed(i)/41, leftToRight.RightSpeed(i)/41);
		}	
	}
	public void MiddleToLeft() {
		for (int i = 0; i < middleToLeft.nSteps(); i++) {
			driveBase.autonomousDrive(middleToLeft.LeftSpeed(i)/12, middleToLeft.RightSpeed(i)/12);
		}
	}
	public void MiddleToRight() {
		for (int i = 0; i < middleToRight.nSteps(); i++) {
			driveBase.autonomousDrive(middleToRight.LeftSpeed(i)/12, middleToRight.RightSpeed(i)/12);
		}
	}
	public void RightToRight() {
		for (int i = 0; i < rightToRight.nSteps(); i++) {
			driveBase.autonomousDrive(rightToRight.LeftSpeed(i)/8, rightToRight.RightSpeed(i)/8);
		}
	}
	public void RightToLeft() {
		for (int i = 0; i < rightToLeft.nSteps(); i++) {
			driveBase.autonomousDrive(rightToLeft.LeftSpeed(i)/19, rightToLeft.RightSpeed(i)/19);
		}
	}
	public void Straight() {
		
	}
}
