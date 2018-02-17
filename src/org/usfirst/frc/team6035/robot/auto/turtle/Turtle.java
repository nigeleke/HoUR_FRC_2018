package org.usfirst.frc.team6035.robot.auto.turtle;

import java.util.*;

public class Turtle {

	private List<TurtleStep> turtleSteps = new ArrayList<>();
	
	public Turtle forward(double n) {
		return add(new Forward(n));
	}
	
	public Turtle forward(double n, double speed) {
		return add(new Forward(n, speed));
	}
	
	public Turtle turn(double n) {
		return add(new Turn(n));
	}
	
	public Turtle turn(double n, double speed) {
		return add(new Turn(n, speed));
	}
	
	private Turtle add(TurtleStep step) {
		turtleSteps.add(step);
		return this;
	}

	public int nSteps() {
		return turtleSteps.size();
	}
	
	public TurtleStep step(int n) {
		return turtleSteps.get(n);
	}
}
