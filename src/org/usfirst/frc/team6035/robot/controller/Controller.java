package org.usfirst.frc.team6035.robot.controller;

import edu.wpi.first.wpilibj.DigitalInput;

import org.usfirst.frc.team6035.robot.*;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;

/**
 * @author Jack Gumley Class for managing input from the robot and the user
 */
public class Controller {

	private Joystick stick = new Joystick(Config.JOYSTICK_PORT);
	private XboxController xbox = new XboxController(Config.XBOX_PORT);
	//private DigitalInput grabberLimitSwitch = new DigitalInput(Config.GRABBER_SWITCH_CHANNEL_DIO);
	private DigitalInput liftUpLimitSwitch = new DigitalInput(Config.LIFT_UP_TRAVEL_DIO);
	private DigitalInput liftDownLimitSwitch = new DigitalInput(Config.LIFT_DOWN_TRAVEL_DIO);
	private boolean twist = true;
	Timer timer = null;
	

	public double getDriveSpeed() {
		double speedY = stick.getY();
		
		double throttle = stick.getThrottle() * -1;
		double normalisedThrottle = (throttle + 1.0) / 2.0;
		normalisedThrottle = normalisedThrottle < 0.25 ? 0.25 : normalisedThrottle;
		
		double throttledSpeed = speedY * normalisedThrottle;

		return throttledSpeed;
	}

	public double getDriveDirection() {
		if(stick.getRawButtonPressed(2)){
			twist = !twist;
		}
		return (twist ? stick.getZ() : stick.getX());
	}

	/**
	 * Return operation for the grabber based off controller input
	 */
	public GrabberOperation getGrabberOperation() {
		boolean leftButtonPressed = xbox.getXButton();
		boolean rightButtonPressed = xbox.getBButton();
		//boolean grabberMicroSwitchClosed = grabberLimitSwitch.get();

		if (leftButtonPressed) {
				//if (grabberMicroSwitchClosed) {
					return GrabberOperation.GRAB;
				//} else if (!grabberMicroSwitchClosed){
					//return GrabberOperation.HOLD;
				}
		 else if (rightButtonPressed) {
			return GrabberOperation.LET_GO;
		 }
		return GrabberOperation.STOP;
	}

	/**
	 * Return operation for grabber arm based off controller input
	 */
	public GrabberArmOperation getGrabberArmOperation() {
		boolean topButtonPressed = xbox.getYButton();
		boolean bottomButtonPressed = xbox.getAButton();

		if (topButtonPressed && !bottomButtonPressed) {
			return GrabberArmOperation.UP;
		} else if (bottomButtonPressed && !topButtonPressed) {
			return GrabberArmOperation.DOWN;
		}
		
		return GrabberArmOperation.STOP;
	}

	/**
	 * Return operation for lift based off controller input
	 */
	public LiftOperation getLiftOperation() {
		int dpadVal = xbox.getPOV();
		boolean goUp = (325 <= dpadVal && dpadVal < 360) || (0 <= dpadVal && dpadVal <= 45);
		boolean goDown = (135 <= dpadVal && dpadVal <= 225);

		if (goUp && !goDown) {
			if (!liftUpLimitSwitch.get()) {
				return LiftOperation.STOP;
			}
			else {
				return LiftOperation.UP;
			}
			//return liftUpLimitSwitch.get() ? LiftOperation.STOP : LiftOperation.UP;
			//return LiftOperation.UP;
		} else if (goDown && !goUp) {
			if (liftDownLimitSwitch.get()) {
				return LiftOperation.DOWN;
			}
			else {
				return LiftOperation.STOP;
			}
			//return liftDownLimitSwitch.get() ? LiftOperation.STOP : LiftOperation.DOWN;
			//return LiftOperation.DOWN;
		}

		return LiftOperation.STOP;
	
	}

	/**
	 * Return operation for climber based off controller input
	 */
	public ClimberOperation getClimberOperation() {
		if(timer == null) {
			timer = new Timer();
			timer.start();
		}
		
		double leftTrigger = xbox.getTriggerAxis(GenericHID.Hand.kLeft);
		double rightTrigger = xbox.getTriggerAxis(GenericHID.Hand.kRight);
		
		boolean bothPressed = leftTrigger >= 0.5 && rightTrigger >= 0.5 ;
		boolean inLastPeriod = (timer.get() >= Config.CLIMBER_DISABLED_TIME);
		
		if (bothPressed && inLastPeriod) {
			return ClimberOperation.UP;
		}
		
		return ClimberOperation.STOP;
	}
	/**
	 * Return operation for cube pusher based off controller input
	 */
	public PushOperation getPushOperation() {

		
		boolean leftBumper = xbox.getBumper(GenericHID.Hand.kLeft);
		boolean rightBumper = xbox.getBumper(GenericHID.Hand.kRight);
		
		if (leftBumper) { 
			return PushOperation.REWIND ;
		
		}
		else if (rightBumper) { 
			return PushOperation.PUSH ;
		}
		
		return PushOperation.STOP;
		
		
		
	}
}
