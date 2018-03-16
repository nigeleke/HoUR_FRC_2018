package org.usfirst.frc.team6035.robot.controller;

import edu.wpi.first.wpilibj.DigitalInput;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.usfirst.frc.team6035.robot.*;
import org.usfirst.frc.team6035.robot.controller.operations.*;
import org.usfirst.frc.team6035.robot.dashboard.RobotType;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;

/**
 * @author Jack Gumley Class for managing input from the robot and the user
 */
public class TeleopController implements Controller {

	private Joystick stick = new Joystick(Config.JOYSTICK_PORT);
	private XboxController xbox = new XboxController(Config.XBOX_PORT);
	private DigitalInput grabberLimitSwitch = new DigitalInput(Config.GRABBER_SWITCH_CHANNEL_DIO);
	private DigitalInput liftUpLimitSwitch = new DigitalInput(Config.LIFT_UP_TRAVEL_DIO);
	private DigitalInput liftDownLimitSwitch = new DigitalInput(Config.LIFT_DOWN_TRAVEL_DIO);
	private DigitalInput grabberArmLimitSwitch = new DigitalInput(Config.GRABBER_ARM_UP_DIO);
	private boolean twist = true;
	private Timer timer;
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
		if (stick.getRawButtonPressed(2)) {
			twist = !twist;
		}
		double direction = (twist ? stick.getZ() : stick.getX());
		currentOperations.driveDirection = direction;
		return direction;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.usfirst.frc.team6035.robot.controller.IController#getGrabberOperation()
	 */
	@Override
	public GrabberOperation getGrabberOperation() {
		boolean leftButtonPressed = xbox.getXButton();
		boolean rightButtonPressed = xbox.getBButton();
		boolean grabberMicroSwitchClosed = grabberLimitSwitch.get();
		GrabberOperation op = GrabberOperation.STOP;
		
		if (leftButtonPressed) {
				if (grabberMicroSwitchClosed) {
					op = GrabberOperation.GRAB;
				} else if (!grabberMicroSwitchClosed) {
					op = GrabberOperation.HOLD;
				}
			else {
				op = GrabberOperation.GRAB;
			}
			
		} else if (rightButtonPressed) {
			op = GrabberOperation.LET_GO;
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
		boolean grabberArmLimit = grabberArmLimitSwitch.get();
		GrabberArmOperation op = GrabberArmOperation.STOP;
		if (topButtonPressed && !bottomButtonPressed) {
			if(grabberArmLimit){
				op = GrabberArmOperation.STOP;
			}
			else {
			op = GrabberArmOperation.UP;
			}
		} else if (bottomButtonPressed && !topButtonPressed) {
			op = GrabberArmOperation.DOWN;
		}
		currentOperations.grabberArmOperation = op;
		return op;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.usfirst.frc.team6035.robot.controller.IController#getLiftOperation()
	 */
	@Override
	public LiftOperation getLiftOperation() {
		int dpadVal = xbox.getPOV();
		boolean goUp = (325 <= dpadVal && dpadVal < 360) || (0 <= dpadVal && dpadVal <= 45);
		boolean goDown = (135 <= dpadVal && dpadVal <= 225);
		boolean separateClimberButton1 = stick.getRawButton(11);
		boolean separateClimberButton2 = stick.getRawButton(12);
		boolean separateClimber = false;
		LiftOperation op = LiftOperation.STOP;

		if (goUp && !goDown && !separateClimber) {
				if (!liftUpLimitSwitch.get()) {
					op = LiftOperation.STOP;
				} else {
					op = LiftOperation.UP;
				}
		} 
		else if (goDown && !goUp && !separateClimber) {
				if (liftDownLimitSwitch.get()) {
					op = LiftOperation.DOWN;
				} else {
					op = LiftOperation.STOP;
				}
		}
		
		else if (separateClimberButton1 && separateClimberButton2) {
			separateClimber = true;
		}
		
		else if (separateClimber && !goDown && goUp) {
			op = LiftOperation.UPSELF;
		}
		
		else if (separateClimber && !goUp && goDown) {
			op = LiftOperation.DOWNSELF;
		}
		
		else {
			op = LiftOperation.STOP;
		}
		currentOperations.liftOperation = op;			
		return op;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.usfirst.frc.team6035.robot.controller.IController#getClimberOperation()
	 */
	@Override
	public ClimberOperation getClimberOperation() {
		if (timer == null) {
			timer = new Timer();
			timer.start();
		}

		double leftTrigger = xbox.getTriggerAxis(GenericHID.Hand.kLeft);
		double rightTrigger = xbox.getTriggerAxis(GenericHID.Hand.kRight);
		
		boolean leftBumper = xbox.getBumper(GenericHID.Hand.kLeft);
		boolean rightBumper = xbox.getBumper(GenericHID.Hand.kRight);

		boolean bothPressed = leftTrigger >= 0.5 && rightTrigger >= 0.5;
		boolean bumperBothPressed = leftBumper && rightBumper;
		
		boolean inLastPeriod = (timer.get() >= Config.CLIMBER_DISABLED_TIME);
		ClimberOperation op = ClimberOperation.STOP;

		if (bothPressed && inLastPeriod) {
			op = ClimberOperation.UP;
		}
		else if (bumperBothPressed && inLastPeriod) {
			
			op = ClimberOperation.DOWN;
		}
		// Climber operation is not recorded; this will always be STOP during autonomous.
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
