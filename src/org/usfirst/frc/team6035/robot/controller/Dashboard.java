package org.usfirst.frc.team6035.robot.controller;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.*;
import org.usfirst.frc.team6035.robot.auto.*;

/**
 * @author Gabriel Love Class for getting autonomous selections from smart
 *         dashboard
 */

public class Dashboard {
	DriverStation driverStation = DriverStation.getInstance();
	private SendableChooser<String> robotPosition = new SendableChooser<>();
	private SendableChooser<String> goal = new SendableChooser<>();

	public void dashboardInit() {
		robotPosition.addObject("Left", "L");
		robotPosition.addObject("Middle", "M");
		robotPosition.addObject("Right", "R");
		robotPosition.addDefault("Right", "R");
		goal.addObject("Switch", "Switch");
		goal.addObject("Scale", "Scale");
		goal.addObject("Base Line", "Base Line");
		goal.addDefault("Switch", "Switch");
	}

	public AutoDirection getPath() {
		if (goal.getSelected().equals("Base Line")) {
			return new DriveStraight();
		} else if (goal.getSelected().equals("Switch")) {
			return getPathForSwitch();
		} else if (goal.getSelected().equals("Scale")) {
			return getPathForScale();
		} else {
			System.out.println("Error, don't understand goal selection");
		}
		return null;
	}

	private AutoDirection getPathForSwitch() {
		String robotPos = robotPosition.getSelected();
		char switchPos = driverStation.getGameSpecificMessage().charAt(0);
		if (robotPos.equals("L") && switchPos == 'L') {
			return new LeftToLeftSwitch();
		} else if (robotPos.equals("L") && switchPos == 'R') {
			return new LeftToRightSwitch();
		} else if (robotPos.equals("M") && switchPos == 'L') {
			return new MiddleToLeftSwitch();
		} else if (robotPos.equals("M") && switchPos == 'R') {
			return new MiddleToRightSwitch();
		} else if (robotPos.equals("R") && switchPos == 'L') {
			return new RightToLeftSwitch();
		} else if (robotPos.equals("R") && switchPos == 'R') {
			return new RightToRightSwitch();
		} else {
			System.out.println("Error, couldn't determine Switch Path");
		}
		return null;
	}

	private AutoDirection getPathForScale() {
		String robotPos = robotPosition.getSelected();
		char scalePos = driverStation.getGameSpecificMessage().charAt(1);
		if (robotPos.equals("L") && scalePos == 'L') {
			return new LeftToLeftScale();
		} else if (robotPos.equals("L") && scalePos == 'R') {
			return new LeftToRightScale();
		} else if (robotPos.equals("M") && scalePos == 'L') {
			return new MiddleToLeftScale();
		} else if (robotPos.equals("M") && scalePos == 'R') {
			return new MiddleToRightScale();
		} else if (robotPos.equals("R") && scalePos == 'L') {
			return new RightToLeftScale();
		} else if (robotPos.equals("R") && scalePos == 'R') {
			return new RightToRightScale();
		} else {
			System.out.println("Error, couldn't determine Switch Path");
		}
		return null;
	}

}
