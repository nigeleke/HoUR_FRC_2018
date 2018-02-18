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
		System.out.println("AutoPlay fileName " + fileName);
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			System.out.println("Post ois");
			robotOperations = (List<RobotOperation>) ois.readObject();
			System.out.println("Post ois2"+ robotOperations.size());
		} catch (Exception ex) {
			System.out.println("Failed to read fileName" + ex.toString());
		}
	}

	public void init() {
		System.out.println("AutoPlay Init1");
		nextOperation = robotOperations.iterator();
	}

	public boolean isFinished() {
		System.out.println("AutoPlay isFinished");
		return !nextOperation.hasNext();
	}

	public RobotOperation next() {
		System.out.println("AutoPlay next1");
		return nextOperation.next();
	}

}
