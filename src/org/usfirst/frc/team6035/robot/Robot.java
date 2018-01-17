// 2018 6035 
package org.usfirst.frc.team6035.robot;

//Imports 

import edu.wpi.first.wpilibj.IterativeRobot;


public class Robot extends IterativeRobot { 
	
	//ROBOT INITIALS
	 
	DriveBase driveBase = new DriveBase();
     
	/*
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
	}

	public void autonomousInit() {

	}

	@Override
	public void autonomousPeriodic() {

		}
	@Override
	public void teleopInit() {

	}
	@Override
	public void teleopPeriodic() {
	driveBase.drive(0.1, 0);
	
}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
		//probably not going to be used but may be usefull...
	}
}
