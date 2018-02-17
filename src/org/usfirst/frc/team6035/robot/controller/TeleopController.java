package org.usfirst.frc.team6035.robot.controller;

import edu.wpi.first.wpilibj.DigitalInput;

import java.util.ArrayList;
import java.util.List;
import org.usfirst.frc.team6035.robot.*;
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
	private boolean twist = true;
	Timer timer = null;
	private List<RobotOperation> recordedOperations = new ArrayList<>();
	private RobotOperation currentOperations = new RobotOperation();
	

	/* (non-Javadoc)
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

	/* (non-Javadoc)
	 * @see org.usfirst.frc.team6035.robot.controller.IController#getDriveDirection()
	 */
	@Override
	public double getDriveDirection() {
		if(stick.getRawButtonPressed(2)){
			twist = !twist;
		}
		double direction = (twist ? stick.getZ() : stick.getX());
		currentOperations.driveDirection = direction;
		return direction;
	}

	/* (non-Javadoc)
	 * @see org.usfirst.frc.team6035.robot.controller.IController#getGrabberOperation()
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
				} else if (!grabberMicroSwitchClosed){
					op = GrabberOperation.HOLD;
				}
		}
		 else if (rightButtonPressed) {
			op = GrabberOperation.LET_GO;
		 }
		currentOperations.grabberOperation = op;
		return op;
	}

	/* (non-Javadoc)
	 * @see org.usfirst.frc.team6035.robot.controller.IController#getGrabberArmOperation()
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

	/* (non-Javadoc)
	 * @see org.usfirst.frc.team6035.robot.controller.IController#getLiftOperation()
	 */
	@Override
	public LiftOperation getLiftOperation() {
		int dpadVal = xbox.getPOV();
		boolean goUp = (325 <= dpadVal && dpadVal < 360) || (0 <= dpadVal && dpadVal <= 45);
		boolean goDown = (135 <= dpadVal && dpadVal <= 225);
		LiftOperation op = LiftOperation.STOP;

		if (goUp && !goDown) {
			if (!liftUpLimitSwitch.get()) {
				op = LiftOperation.STOP;
			}
			else {
				op = LiftOperation.UP;
			}
		} else if (goDown && !goUp) {
			if (liftDownLimitSwitch.get()) {
				op = LiftOperation.DOWN;
			}
			else {
				op = LiftOperation.STOP;
			}
		}
		currentOperations.liftOperation = op;
		return op;
	
	}

	/* (non-Javadoc)
	 * @see org.usfirst.frc.team6035.robot.controller.IController#getClimberOperation()
	 */
	@Override
	public ClimberOperation getClimberOperation() {
		if(timer == null) {
			timer = new Timer();
			timer.start();
		}
		
		double leftTrigger = xbox.getTriggerAxis(GenericHID.Hand.kLeft);
		double rightTrigger = xbox.getTriggerAxis(GenericHID.Hand.kRight);
		
		boolean bothPressed = leftTrigger >= 0.5 && rightTrigger >= 0.5 ;
		boolean inLastPeriod = (timer.get() >= Config.CLIMBER_DISABLED_TIME);
		ClimberOperation op = ClimberOperation.STOP;
		
		if (bothPressed && inLastPeriod) {
			op = ClimberOperation.UP;
		}
		return op;
	}
	/* (non-Javadoc)
	 * @see org.usfirst.frc.team6035.robot.controller.IController#getPushOperation()
	 */
	@Override
	public PushOperation getPushOperation() {

		
		boolean leftBumper = xbox.getBumper(GenericHID.Hand.kLeft);
		boolean rightBumper = xbox.getBumper(GenericHID.Hand.kRight);
		PushOperation op = PushOperation.STOP;
		
		if (leftBumper) { 
			op = PushOperation.REWIND ;
		
		}
		else if (rightBumper) { 
			op = PushOperation.PUSH ;
		}
		currentOperations.pushOperation = op;
		return op;	
		
	}

	@Override
	public void nextCycle() {
	//TODO
	recordedOperations.add(currentOperations);	
	currentOperations = new RobotOperation();
	}
}
