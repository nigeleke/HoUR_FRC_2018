// 2018 6035 
package org.usfirst.frc.team6035.robot;

//Imports 
import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team6035.robot.gamecomponents.tele.*;
import org.usfirst.frc.team6035.robot.gamecomponents.auto.*;
import org.usfirst.frc.team6035.robot.auto.*;
import org.usfirst.frc.team6035.robot.controller.*;
/**
 * @author Jack Gumley Integrated class to manage controllers and game
 *         components.
 */

public class Robot extends IterativeRobot {

	private DriverStation driverStation = DriverStation.getInstance();

	private Controller controller = new Controller();
	private Lift lift = new Lift();
	private Grabber grabber = new Grabber();
	private GrabberArm grabberArm = new GrabberArm();
	private DriveBase driveBase = new DriveBase();
	private Climber climber = new Climber();
	private Dashboard dashboard = new Dashboard();
	private Autonomous auto = new Autonomous(driveBase, grabberArm, grabber, lift);
	
	private int autoPeriod;

	@Override
	public void robotInit() {
		dashboard.dashboardInit();
	}

	@Override
	public void autonomousInit() {
		autoPeriod = 0;
	}

	@Override
	public void autonomousPeriodic() {
		auto.doNextAction(autoPeriod);
		autoPeriod++;
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
		operateClimber();
	}

	/**
	 * Asking the controller which speed and direction to go, telling the drive base
	 * to drive.
	 */
	
	private void driveDriveBase() {
		double speed = controller.getDriveSpeed();
		double direction = controller.getDriveDirection();
		driveBase.manualDrive(speed, direction);

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
			lift.compensate();
			break;
		case STOP:
			climber.stop();
			break;
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
