package org.usfirst.frc.team6035.robot.controller;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.usfirst.frc.team6035.robot.*;
import org.usfirst.frc.team6035.robot.controller.operations.*;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

/**
 * @author Jack Gumley Class for managing input from the robot and the user
 */
public class TeleopController implements Controller {

	private Joystick stick = new Joystick(Config.JOYSTICK_PORT);
	private XboxController xbox = new XboxController(Config.XBOX_PORT);
	private DigitalInput grabberOutLimitSwitch = new DigitalInput(Config.GRABBER_SWITCH_OUT_DIO);
	private DigitalInput grabberInLimitSwitch = new DigitalInput(Config.GRABBER_SWITCH_IN_DIO);
	private List<RobotOperations> recordedOperations = new ArrayList<>();
	private RobotOperations currentOperations = new RobotOperations();
	private boolean recording = false;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.usfirst.frc.team6035.robot.controller.IController#getDriveSpeed()
	 */
	@Override
	public double getDriveSpeed() {
		double speedY = stick.getY();

		double throttle = stick.getThrottle() * -1;
		double normalisedThrottle = (throttle + 1.0) / 2.0;
		normalisedThrottle = normalisedThrottle < 0.25 ? 0.25 : normalisedThrottle;

		double throttledSpeed = speedY * normalisedThrottle;

		currentOperations.driveSpeed = throttledSpeed;
		return throttledSpeed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.usfirst.frc.team6035.robot.controller.IController#getDriveDirection()
	 */
	@Override
	public double getDriveDirection() {
		double direction = stick.getZ();
		currentOperations.driveDirection = direction;
		return direction;
	}

	/*
	 * (non-Javadoc)
;	 * 
	 * @see
	 * org.usfirst.frc.team6035.robot.controller.IController#getGrabberOperation()
	 */
	@Override
	public GrabberOperation getGrabberOperation() {
		boolean leftButtonPressed = xbox.getXButton();
		boolean rightButtonPressed = xbox.getBButton();
		boolean grabberInSwitchNotEngaged = grabberInLimitSwitch.get();
		boolean grabberOutSwitchNotEngaged = grabberOutLimitSwitch.get();
		GrabberOperation op = GrabberOperation.STOP;
		
		if (leftButtonPressed) {
			if (grabberInSwitchNotEngaged) {
				op = GrabberOperation.GRAB;
			} else if (!grabberInSwitchNotEngaged) {
				op = GrabberOperation.HOLD;
			}
				
			
		} else if (rightButtonPressed) {
			if (grabberOutSwitchNotEngaged){
				op = GrabberOperation.LET_GO;
			} else if (!grabberOutSwitchNotEngaged) {
				op = GrabberOperation.HOLD;
			}
		}
		currentOperations.grabberOperation = op;
		return op;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.usfirst.frc.team6035.robot.controller.IController#getGrabberArmOperation(
	 * )
	 */
	@Override
	public GrabberArmOperation getGrabberArmOperation() {
		boolean topButtonPressed = xbox.getYButton();
		boolean bottomButtonPressed = xbox.getAButton();
		GrabberArmOperation op = GrabberArmOperation.STOP;
		if (topButtonPressed && !bottomButtonPressed) {
			op = GrabberArmOperation.UP;
		} else if (bottomButtonPressed && !topButtonPressed) {
			op = GrabberArmOperation.DOWN;
		}
		currentOperations.grabberArmOperation = op;
		return op;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.usfirst.frc.team6035.robot.controller.IController#getPushOperation()
	 */
	@Override
	public PushOperation getPushOperation() {

		boolean pusherButton = xbox.getRawButton(9);
		boolean reversePusherButton = xbox.getRawButton(10);
		PushOperation op = PushOperation.STOP;

		if (pusherButton) {
			op = PushOperation.REWIND;

		} else if (reversePusherButton) {
			op = PushOperation.PUSH;
		}
		currentOperations.pushOperation = op;
		return op;

	}

	@Override
	public void nextCycle() {
		boolean startButton = xbox.getStartButtonPressed();
		boolean backButton = xbox.getBackButtonPressed();
		if (startButton) {
			recording = !recording;
		}
		if (recording) {
			recordedOperations.add(currentOperations);
			currentOperations = new RobotOperations();
		}
		if (backButton && !recording) {
			saveOperations();
		}
	}

	private void saveOperations() {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("/home/lvuser/RobotOperations.dat"))) {
			oos.writeObject(recordedOperations);
		} catch (Exception ex) {
			System.out.println("Failed to save RobotOperations" + ex.toString());
		}
	}
}
