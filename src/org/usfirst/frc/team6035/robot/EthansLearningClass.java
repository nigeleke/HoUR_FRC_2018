// 2018 6035 
package org.usfirst.frc.team6035.robot;

//Imports 

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class EthansLearningClass extends IterativeRobot {
	
	//ROBOT INITIALS
	 
     Joystick stick; // Class for joy-stick
     SmartDashboardCall smartDashboard = new SmartDashboardCall();
     DriveBase driveBase = new DriveBase();
     double gyroYaw;
     double timer;
   
     
     
	
	/*
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {

        stick = new Joystick(1);
        timer = 0;
       
        
	}

	public void autonomousInit() {
	smartDashboard.smartDashboardGet();
	
	}

	
	@Override
	public void autonomousPeriodic() {
	smartDashboard.smartDashboardAuto();
	for(double timer = 0; timer <= 10; timer++) {
	
		if(gyroYaw > 5 && gyroYaw < 180) {
			driveBase.drive(0.5, -0.5);
		}
		else if(gyroYaw < 355 && gyroYaw > 180) {
			driveBase.drive(0.5, 0.5);
		}
		else {
			driveBase.drive(0.5, 0);
		
			}
		}
	}
	
	

	@Override
	public void teleopPeriodic() {
	driveBase.drive(stick.getY(), stick.getX());
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	
	public void testPeriodic()
	{
}}


