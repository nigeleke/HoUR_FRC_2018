package org.usfirst.frc.team6035.robot.gamecomponents.tele;

import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team6035.robot.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * @author Gabriel Love Class for operating the drive base
 */
public class DriveBase {
	// Sparks
	private Spark Backleft = new Spark(Config.DB_LEFT_BACK_CHANNEL);
	private Spark Frontleft = new Spark(Config.DB_LEFT_FRONT_CHANNEL);
	private Spark Backright = new Spark(Config.DB_RIGHT_BACK_CHANNEL);
	private Spark Frontright = new Spark(Config.DB_RIGHT_FRONT_CHANNEL);

	/**
	 * Motor group for left side
	 */
	private SpeedController left = new SoftSpeedController(new SpeedControllerGroup(Backleft, Frontleft));

	/**
	 * Motor group for right side
	 */
	private SpeedController right = new SoftSpeedController(new SpeedControllerGroup(Backright, Frontright));

	/**
	 * Calling the differential drive from this method
	 */
	private DifferentialDrive drive = new DifferentialDrive(left, right);

	/**
	 * @author Gabriel Love
	 * @param speed
	 *            = the the value we use to set the speed of the robot in the
	 *            backwards/forwards direction
	 * @param direction
	 *            = the value we assign the amount we differ from a straight path
	 */
	public void manualDrive(double speed, double direction) {
		drive.arcadeDrive(speed, Config.DIRECTION_SENSITIVITY*direction);
	}
	
	public void autonomousDrive(double leftSpeed, double rightSpeed) {
		drive.tankDrive(leftSpeed, rightSpeed);
	}
}
