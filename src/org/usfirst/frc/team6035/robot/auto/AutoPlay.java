package org.usfirst.frc.team6035.robot.auto;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.usfirst.frc.team6035.robot.RobotOperation;

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

	public boolean isFinished() {
		return !nextOperation.hasNext();
	}

	public RobotOperation next() {
		return nextOperation.next();
	}

}
