package org.usfirst.frc.team6035.robot.auto.turtle;

import java.util.*;

public class Turtle {
	
	private List<TurtleStep> turtleSteps = new ArrayList<>();
	private int nSteps = 0;
	
	public Turtle go(double n) {
		return add(new Go(n));
	}
	
	public Turtle turn(int n) {
		return add(new Turn(n));
	}
	
	private Turtle add(TurtleStep step) {
		turtleSteps.add(step);
		nSteps = step.nSteps();
		return this;
	}
	
	public int nSteps() {
		return nSteps;
	}
}
