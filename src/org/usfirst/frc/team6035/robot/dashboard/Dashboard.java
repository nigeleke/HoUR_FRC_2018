package org.usfirst.frc.team6035.robot.dashboard;

import edu.wpi.first.wpilibj.DriverStation;

import edu.wpi.first.wpilibj.smartdashboard.*;

import org.usfirst.frc.team6035.robot.auto.AutoPlay;
import org.usfirst.frc.team6035.robot.auto.AutoPlayGroup;
import org.usfirst.frc.team6035.robot.auto.recorded.*;

/**
 * @author Gabriel Love Class for getting autonomous selections from smart
 *         dashboard
 */

public class Dashboard {
	private DriverStation driverStation = DriverStation.getInstance();
	private SendableChooser<RobotPosition> robotPosition = new SendableChooser<>();
	private SendableChooser<Goal> goal = new SendableChooser<>();

	public void dashboardInit() {
		robotPosition.addDefault("Left", RobotPosition.LEFT);
		robotPosition.addObject("Middle", RobotPosition.MIDDLE);
		robotPosition.addObject("Right", RobotPosition.RIGHT);

		goal.addObject("Switch", Goal.SWITCH);
		goal.addObject("Scale", Goal.SCALE);
		goal.addObject("Base Line", Goal.BASE_LINE);
		goal.addObject("StraightCube", Goal.STRAIGHT_CUBE);
		goal.addDefault("Test", Goal.TEST);
		
		SmartDashboard.putData("Robot Position", robotPosition);
		SmartDashboard.putData("Drive Goal", goal);
	}

	public AutoPlayGroup getAutoSequence() {
		RobotPosition robotPos = robotPosition.getSelected();
		String switchPos = getGameSpecificMessage(0);
		Goal selectedGoal = goal.getSelected();
		AutoPlayGroup apGroup = new AutoPlayGroup();
		apGroup.add(getAutoPath(selectedGoal));
		if(selectedGoal == Goal.SCALE) {
			apGroup.add(new RaiseLift());
		}
		if(selectedGoal == Goal.SWITCH && robotPos == RobotPosition.LEFT && switchPos.equals("L")){
			apGroup.add(new PushCube());
		}
		else if(selectedGoal == Goal.SWITCH && robotPos == RobotPosition.RIGHT && switchPos.equals("R")){
			apGroup.add(new PushCube());
		}
		if(selectedGoal == Goal.STRAIGHT_CUBE && robotPos == RobotPosition.LEFT && switchPos.equals("L")) {
			apGroup.add(new PushCube());
		}
		else if(selectedGoal == Goal.STRAIGHT_CUBE && robotPos == RobotPosition.RIGHT && switchPos.equals("R")) {
			apGroup.add(new PushCube());
		}
		return apGroup;
	}

	private AutoPlay getAutoPath(Goal selectedGoal) {
		switch(selectedGoal) {
			case BASE_LINE:	return new DriveStraight();
			case STRAIGHT_CUBE: return new DriveStraight();
			case SWITCH:		return getPathForSwitch();
			case SCALE:		return getPathForScale();
			case TEST: 		return new TestAuto();
			default: System.out.println("Error, don't understand goal selection"); break;
		}

		return new TestAuto();
	}

	private AutoPlay getPathForSwitch() {
		RobotPosition robotPos = robotPosition.getSelected();
		String switchPos = getGameSpecificMessage(0);

		if (robotPos == RobotPosition.LEFT && switchPos.equals("L")) {
			return new DriveStraight();
		} else if (robotPos == RobotPosition.LEFT && switchPos.equals("R")) {
			return new DriveStraight();
		} else if (robotPos == RobotPosition.MIDDLE && switchPos.equals("L")) {
			return new DriveStraight();
		} else if (robotPos == RobotPosition.MIDDLE && switchPos.equals("R")) {
			return new DriveStraight();
		} else if (robotPos == RobotPosition.RIGHT && switchPos.equals("L")) {
			return new DriveStraight();
		} else if (robotPos == RobotPosition.RIGHT && switchPos.equals("R")) {
			return new DriveStraight();
		} else {
			System.out.println("Error, couldn't determine Switch Path");
		}

		return null;
	}

	private String getGameSpecificMessage(int index) {
		String message = driverStation.getGameSpecificMessage();
		boolean isEmpty = message == null || message.length() == 0;
		boolean indexInRange = message != null && index < message.length();

		if (!isEmpty && indexInRange) {
			return Character.toString(message.charAt(index));
		} else {
			return "";
		}
	}

	private AutoPlay getPathForScale() {
		RobotPosition robotPos = robotPosition.getSelected();
		String scalePos = getGameSpecificMessage(1);

		if (robotPos == RobotPosition.LEFT && scalePos.equals("L")) {
			return new LeftToLeftScale();
		} else if (robotPos == RobotPosition.LEFT && scalePos.equals("R")) {
			return new LeftToRightScale();
		} else if (robotPos == RobotPosition.MIDDLE && scalePos.equals("L")) {
			System.out.println("Autonomous combination not available");
			return null;
		} else if (robotPos == RobotPosition.MIDDLE && scalePos.equals("R")) {
			System.out.println("Autonomous combination not available");
			return null;
		} else if (robotPos == RobotPosition.RIGHT && scalePos.equals("L")) {
			return new RightToLeftScale();
		} else if (robotPos == RobotPosition.RIGHT && scalePos.equals("R")) {
			return new RightToRightScale();
		} else {
			System.out.println("Error, couldn't determine Switch Path");
		}

		return null;
	}
	

}
