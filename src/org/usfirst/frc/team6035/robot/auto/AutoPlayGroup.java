package org.usfirst.frc.team6035.robot.auto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.usfirst.frc.team6035.robot.controller.ClimberOperation;
import org.usfirst.frc.team6035.robot.controller.Controller;
import org.usfirst.frc.team6035.robot.controller.GrabberArmOperation;
import org.usfirst.frc.team6035.robot.controller.GrabberOperation;
import org.usfirst.frc.team6035.robot.controller.LiftOperation;
import org.usfirst.frc.team6035.robot.controller.PushOperation;

public class AutoPlayGroup implements Controller {

	private List<AutoPlay> autoPlayObjects = new ArrayList<>();
	private Iterator<AutoPlay> replayIterator = null;
	
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
