package org.usfirst.frc.team6035.robot.auto;

import java.io.FileInputStream;
import java.io.IOException;
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
		if (isResource) {
			loadFromResource(fileName);
		} else {
			loadFromFile(fileName);
		}
	}

	private void loadFromFile(String fileName) {
		try (InputStream stream = new FileInputStream(fileName)) {
			loadFromStream(stream);
		} catch (IOException e) {
			System.out.println("Failed to loadFromFile: " + e.toString());
		}
	}

	private void loadFromResource(String fileName) {
		try (InputStream stream = this.getClass().getResourceAsStream(fileName)) {
			loadFromStream(stream);
		} catch (IOException ex) {
			System.out.println("Failed to loadFromResource " + ex.toString());
		}
	}

	@SuppressWarnings("unchecked")
	private void loadFromStream(InputStream stream) {
		try (ObjectInputStream ois = new ObjectInputStream(stream)) {
			robotOperations = (List<RobotOperations>) ois.readObject();
		} catch (Exception ex) {
			System.out.println("Failed to loadFromStream: " + ex.toString());
		}
	}

	public void init() {
		nextOperation = robotOperations.iterator();
	}

	public boolean isFinished() {
		return !nextOperation.hasNext();
	}

	public RobotOperations next() {
		return nextOperation.next();
	}

}
