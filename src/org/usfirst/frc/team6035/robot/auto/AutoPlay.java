package org.usfirst.frc.team6035.robot.auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.usfirst.frc.team6035.robot.controller.operations.RobotOperations;

/**
 * autonomous for base paths
 * 
 * @author SKI
 *
 */
public abstract class AutoPlay {

	private List<RobotOperations> robotOperations = new ArrayList<>();
	private Iterator<RobotOperations> nextOperation;

	public AutoPlay(String fileName, boolean isResource) {
		System.out.println("AutoPlay fileName " + fileName + isResource);
		if (isResource) {
			loadFromResource(fileName);
		}

		else {
			loadFromFile(fileName);
		}
	}

	private void loadFromFile(String fileName) {
		System.out.println("loadFromFile " + fileName);
		try {
			loadFromStream(new FileInputStream(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Failed to Open File" + e.toString());
		}
	}

	private void loadFromResource(String fileName) {
		System.out.println("Resource 0" + fileName);
		try {
			System.out.println("Resource 1");
			InputStream stream = AutoPlay.class.getResourceAsStream(fileName);
			//loadFromStream(stream);
			System.out.println(fileName + " " + stream);
			System.out.println("Resource 2");
		} catch (Exception ex) {
			System.out.println("Failed to read resource " + ex.toString());
		}
	}

	@SuppressWarnings("unchecked")
	private void loadFromStream(InputStream stream) {
		System.out.println("load from strem ois +" + stream);
		try (ObjectInputStream ois = new ObjectInputStream(stream)) {
			System.out.println("Post ois" + ois);
			robotOperations = (List<RobotOperations>) ois.readObject();
			System.out.println("Post ois2" + robotOperations.size());
		} catch (Exception ex) {
			System.out.println("Failed to read stream" + stream + " " + ex.toString());
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

	public RobotOperations next() {
		System.out.println("AutoPlay next1");
		return nextOperation.next();
	}

}
