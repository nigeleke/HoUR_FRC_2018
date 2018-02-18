package org.usfirst.frc.team6035.robot.auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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

	public AutoPlay(String fileName, boolean isResource) {
		System.out.println("AutoPlay fileName " + fileName);
		if(isResource) {
			loadFromResource(fileName);
		}
		
		else {
			loadFromFile(fileName);
		}
	}

	private void loadFromFile(String fileName) {
		try {
			loadFromStream(new FileInputStream(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Failed to Open File"+ e.toString());
		}
	}
	
	@SuppressWarnings("unchecked")
	private void loadFromStream(InputStream stream) {
		try (ObjectInputStream ois = new ObjectInputStream(stream)) {
			System.out.println("Post ois");
			robotOperations = (List<RobotOperation>) ois.readObject();
			System.out.println("Post ois2"+ robotOperations.size());
		} catch (Exception ex) {
			System.out.println("Failed to read fileName" + ex.toString());
		}
	}
	
	private void loadFromResource(String fileName) {
		loadFromStream(getClass().getResourceAsStream(fileName));
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
