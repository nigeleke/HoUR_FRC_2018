package org.usfirst.frc.team6035.robot.controller;

import org.usfirst.frc.team6035.robot.RobotOperation;
import org.usfirst.frc.team6035.robot.auto.AutoPlay;
import org.usfirst.frc.team6035.robot.auto.AutoPlayGroup;

public class AutonomousController implements Controller {
	private AutoPlayGroup autoPlay;
	private int playGroupSteps = 0;
	private AutoPlay currentAutoPlay;
	private RobotOperation currentOperation;
	
	public AutonomousController(AutoPlayGroup autoPlay) {
		this.autoPlay = autoPlay;
		currentAutoPlay = autoPlay.get(0);
		currentOperation = currentAutoPlay.next();
	}
	
	@Override
	public double getDriveSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDriveDirection() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GrabberOperation getGrabberOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GrabberArmOperation getGrabberArmOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LiftOperation getLiftOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClimberOperation getClimberOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PushOperation getPushOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void nextCycle() {
		// TODO Auto-generated method stub
		
	}

}
