package org.usfirst.frc.team6035.robot.auto.recorded;

import org.usfirst.frc.team6035.robot.auto.AutoPlay;

public class TestResource extends AutoPlay {
	
	public TestResource() {
		super("LeftToLeftSwitch.dat", true);
	}
	
	public static void main(String[] args) {
		TestResource tr = new TestResource();
		System.out.println(tr);
	}

}
