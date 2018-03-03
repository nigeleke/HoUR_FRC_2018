package org.usfirst.frc.team6035.robot.gamecomponents;

import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team6035.robot.*;
import org.usfirst.frc.team6035.robot.dashboard.RobotType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * @author Gabriel Love Class for operating the drive base
 */
public class DriveBase {
	
	private SpeedController Backleft = null;
	private SpeedController Frontleft = null;
	private SpeedController Backright = null;
	private SpeedController Frontright = null;
	private SpeedController left = null;
	private SpeedController right = null;
	private DifferentialDrive drive = null;
	
	public DriveBase(RobotType type) {
		if(type == RobotType.COMPETITION) {
			Backleft = new Spark(Config.DB_LEFT_BACK_CHANNEL);
			Frontleft = new Spark(Config.DB_LEFT_FRONT_CHANNEL);
			Backright = new Spark(Config.DB_RIGHT_BACK_CHANNEL);
			Frontright = new Spark(Config.DB_RIGHT_FRONT_CHANNEL);
		}
		else {
			Backleft = new VictorSP(Config.DB_LEFT_BACK_CHANNEL);
			Frontleft = new VictorSP(Config.DB_LEFT_FRONT_CHANNEL);
			Backright = new VictorSP(Config.DB_RIGHT_BACK_CHANNEL);
			Frontright = new VictorSP(Config.DB_RIGHT_FRONT_CHANNEL);
		}
		/**
		 * Motor group for left side
		 */
		left = new SpeedControllerGroup(Backleft, Frontleft);

		/**
		 * Motor group for right side
		 */
		right = new SpeedControllerGroup(Backright, Frontright);
		/**
		 * Calling the differential drive from this method
		 */
		drive = new DifferentialDrive(left, right);

	}
	
	
	/**
	 * @author Gabriel Love
	 * @param speed
	 *            = the the value we use to set the speed of the robot in the
	 *            backwards/forwards direction
	 * @param direction
	 *            = the value we assign the amount we differ from a straight path
	 */
	public void manualDrive(double speed, double direction) {
		drive.arcadeDrive(speed, Config.DIRECTION_SENSITIVITY * direction);
	}

	public void autonomousDrive(double leftSpeed, double rightSpeed) {
		drive.tankDrive(leftSpeed, rightSpeed);
	}
}
