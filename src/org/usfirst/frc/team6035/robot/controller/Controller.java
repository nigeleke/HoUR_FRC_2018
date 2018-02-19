package org.usfirst.frc.team6035.robot.controller;

import org.usfirst.frc.team6035.robot.controller.operations.ClimberOperation;
import org.usfirst.frc.team6035.robot.controller.operations.GrabberArmOperation;
import org.usfirst.frc.team6035.robot.controller.operations.GrabberOperation;
import org.usfirst.frc.team6035.robot.controller.operations.LiftOperation;
import org.usfirst.frc.team6035.robot.controller.operations.PushOperation;

public interface Controller {

	double getDriveSpeed();

	double getDriveDirection();

	/**
	 * Return operation for the grabber based off controller input
	 */
	GrabberOperation getGrabberOperation();

	/**
	 * Return operation for grabber arm based off controller input
	 */
	GrabberArmOperation getGrabberArmOperation();

	/**
	 * Return operation for lift based off controller input
	 */

	LiftOperation getLiftOperation();


	/**
	 * Return operation for climber based off controller input
	 */
	ClimberOperation getClimberOperation();

	/**
	 * Return operation for cube pusher based off controller input
	 */
	PushOperation getPushOperation();

	/**
	 * Notify controller the next 20 ms cycle is about to start
	 */
	void nextCycle();

}