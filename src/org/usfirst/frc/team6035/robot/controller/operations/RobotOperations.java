package org.usfirst.frc.team6035.robot.controller.operations;

import java.io.Serializable;

public class RobotOperations implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Double driveSpeed;
	public Double driveDirection;
	public GrabberOperation grabberOperation;
	public GrabberArmOperation grabberArmOperation;
	public LiftOperation liftOperation;
	public PushOperation pushOperation;

}
