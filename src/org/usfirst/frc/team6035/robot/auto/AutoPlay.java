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
public abstract class AutoPlay {

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

}
