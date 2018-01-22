// 2018 6035 
package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.DriverStation;

//Imports 

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.*;

/**
 * @author Jack Gumley Integrated class to manage controllers and game
 *         components.
 */

public class Robot extends IterativeRobot {

	DriverStation driverStation = DriverStation.getInstance();

	Controller controller = new Controller();
	Lift lift = new Lift();
	Grabber grabber = new Grabber();
	GrabberArm grabberArm = new GrabberArm();
	DriveBase driveBase = new DriveBase();
	Climber climber = new Climber();

	@Override
	public void robotInit() {
		System.out.println(">>> robotInit");
		System.out.println("    driveStation::alliance " + driverStation.getAlliance());
		System.out.println("    driveStation::gameSpecificMessage " + driverStation.getGameSpecificMessage());
		System.out.println("    driveStation::location " + driverStation.getLocation());
		System.out.println("<<< robotInit");
	}

	@Override
	public void autonomousInit() {
		System.out.println(">>> autonomousInit");
		System.out.println("    driveStation::alliance " + driverStation.getAlliance());
		System.out.println("    driveStation::gameSpecificMessage " + driverStation.getGameSpecificMessage());
		System.out.println("    driveStation::location " + driverStation.getLocation());
		System.out.println("<<< autonomousInit");
	}

	@Override
	public void autonomousPeriodic() {

	}

	@Override
	public void teleopInit() {
		Command cmd = new Command() {

			private int i = 0;

			@Override
			protected void execute() {
				i++;
				System.out.println("execute::iteration: " + i);
			}

			@Override
			protected boolean isFinished() {
				boolean finished = i >= 10;
				System.out.println("execute::isFinished: " + finished);
				return finished;
			}

		};

		cmd.start();
	}

	@Override
	public void teleopPeriodic() {

		driveDriveBase();
		operateLift();
		operateGrabberArm();
		operateGrabber();
		operateClimber();

	}

	/**
	 * Asking the controller which speed and direction to go, telling the drive base
	 * to drive.
	 */

	private void driveDriveBase() {

		double speed = controller.getDriveSpeed();
		double direction = controller.getDriveDirection();
		driveBase.drive(speed, direction);

	}

	/**
	 * Getting instructions from controller as to which direction to operate the
	 * lift
	 */

	private void operateLift() {

		LiftOperation OP = controller.getLiftOperation();
		switch (OP) {
		case UP:
			lift.up();
			break;
		case DOWN:
			lift.down();
			break;
		case STOP:
			lift.stop();
			break;
		default:
			System.out.println("Error in operateLift Switch");
			break;
		}
	}

	/**
	 * Get instructions from controller to as which direction to operate the grabber
	 * arm.
	 */

	private void operateGrabberArm() {

		GrabberArmOperation OP = controller.getGrabberArmOperation();
		switch (OP) {
		case UP:
			grabberArm.up();
			break;
		case DOWN:
			grabberArm.down();
			break;
		case STOP:
			grabberArm.stop();
			break;
		default:
			System.out.println("Error in operateGrabberArm Switch");
			break;
		}
	}

	/**
	 * Get instructions from controller to as which direction to operate the
	 * grabber.
	 */

	private void operateGrabber() {

		GrabberOperation OP = controller.getGrabberOperation();
		switch (OP) {
		case GRAB:
			grabber.grab();
			break;
		case HOLD:
			grabber.hold();
			break;
		case LET_GO:
			grabber.letgo();
			break;
		case STOP:
			grabber.stop();
			break;
		default:
			System.out.println("Error in operateGrabber Switch");
			break;
		}
	}
	
	private void operateClimber() {
		ClimberOperation OP = controller.getClimberOperation();
		switch (OP) {
		case UP:
			climber.up();
			break;
		case DOWN:
			climber.down();
			break;
		case STOP:
			climber.stop();
		default:
			System.out.println("Error in operateClimber Switch");
			break;
		}
	}

	@Override
	public void testPeriodic() {
		// probably not going to be used but may be useful...
	}
}
