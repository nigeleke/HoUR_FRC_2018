// 2018 6035 
package org.usfirst.frc.team6035.robot;

//Imports 

import edu.wpi.first.wpilibj.IterativeRobot;


public class Robot extends IterativeRobot {
     
	Controller controller = new Controller();
	Lift lift = new Lift();
	Grabber grabber = new Grabber();
	GrabberArm grabberArm = new GrabberArm();
	DriveBase driveBase = new DriveBase();
	
	
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
	
		driveDriveBase();
		operateLift();
		operateGrabberArm();
		operateGrabber();
		
	}
	
	private void driveDriveBase() {
		
	double speed = controller.getDriveSpeed();
	double direction = controller.getDriveDirection();
	driveBase.drive(speed, direction);
	}
	
	private void operateLift() {
		
	}

	private void operateGrabberArm() {
		
	}
	
	private void operateGrabber() {
		
	}

	@Override
	public void testPeriodic() {
		//probably not going to be used but may be usefull...
	}
}
