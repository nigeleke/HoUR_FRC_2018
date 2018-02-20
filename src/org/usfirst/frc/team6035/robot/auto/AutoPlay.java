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
		System.out.println("AutoPlay::ctor fileName: " + fileName + " isResource: " + isResource);
		if (isResource) {
			loadFromResource(fileName);
		} else {
			loadFromFile(fileName);
		}
	}

	private void loadFromFile(String fileName) {
		System.out.println("AutoPlay::loadFromFile " + fileName);
		try (InputStream stream = new FileInputStream(fileName)) {
			loadFromStream(stream);
		} catch (IOException e) {
			System.out.println("Failed to loadFromFile: " + e.toString());
		}
	}

	private void loadFromResource(String fileName) {
		System.out.println("AutoPlay::loadFromResource 0 " + fileName);
		try (InputStream stream = getClass().getResourceAsStream(fileName)) {
			System.out.println("AutoPlay::loadFromResource 1 " + fileName + " stream: " + stream);
			loadFromStream(stream);
			System.out.println("AutoPlay::loadFromResource 2 " + fileName + " stream: " + stream);
		} catch (IOException ex) {
			System.out.println("Failed to loadFromResource " + ex.toString());
		}
	}

	@SuppressWarnings("unchecked")
	private void loadFromStream(InputStream stream) {
		System.out.println("AutoPlay::loadFromStream 0 " + stream);
		try (ObjectInputStream ois = new ObjectInputStream(stream)) {
			System.out.println("AutoPlay::loadFromStream 1 " + ois);
			robotOperations = (List<RobotOperations>) ois.readObject();
			System.out.println("AutoPlay::loadFromStream 2 " + ois);
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
