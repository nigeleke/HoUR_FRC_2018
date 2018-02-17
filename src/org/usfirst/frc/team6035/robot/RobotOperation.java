package org.usfirst.frc.team6035.robot;

import java.io.Serializable;

import org.usfirst.frc.team6035.robot.controller.GrabberArmOperation;
import org.usfirst.frc.team6035.robot.controller.GrabberOperation;
import org.usfirst.frc.team6035.robot.controller.LiftOperation;
import org.usfirst.frc.team6035.robot.controller.PushOperation;

public class RobotOperation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public Double driveSpeed;
	public Double driveDirection;
	public GrabberOperation grabberOperation;
	public GrabberArmOperation grabberArmOperation;
	public LiftOperation liftOperation;
	public PushOperation pushOperation;
	
	
}
