package org.usfirst.frc.team6035.robot.auto;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.usfirst.frc.team6035.robot.RobotOperation;
import org.usfirst.frc.team6035.robot.controller.ClimberOperation;
import org.usfirst.frc.team6035.robot.controller.Controller;
import org.usfirst.frc.team6035.robot.controller.GrabberArmOperation;
import org.usfirst.frc.team6035.robot.controller.GrabberOperation;
import org.usfirst.frc.team6035.robot.controller.LiftOperation;
import org.usfirst.frc.team6035.robot.controller.PushOperation;
import org.usfirst.frc.team6035.robot.gamecomponents.tele.DriveBase;

/**
 * autonomous for base paths
 * 
 * @author SKI
 *
 */
public abstract class AutoPlay implements Controller {

	private List<RobotOperation> robotOperations = new ArrayList<>();
	private Iterator<RobotOperation> nextOperation;

	@SuppressWarnings("unchecked")
	public AutoPlay(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			robotOperations = (List<RobotOperation>) ois.readObject();
		} catch (Exception ex) {
			System.out.println("Failed to read fileName" + ex.toString());
		}
	}

	public void init() {
		nextOperation = robotOperations.iterator();
	}

	public void doNextAction(DriveBase driveBase) {
		RobotOperation op = nextOperation.next();
		driveBase.manualDrive(op.driveSpeed, op.driveDirection);
	}

	public boolean isFinished() {
		return !nextOperation.hasNext();
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
