package org.usfirst.frc.team6035.robot.gamecomponents.tele;

import edu.wpi.first.wpilibj.VictorSP;
import org.usfirst.frc.team6035.robot.*;

/**
 * @author Harrison King Class to operate the grabber arm
 */
public class GrabberArm {
	private VictorSP motor = new VictorSP(Config.GRABBER_ARM_CHANNEL);
	private SoftSpeedController controller = new SoftSpeedController(motor);

	/**
	 * sets the motor speed to operate the grabber arm
	 */
	public void up() {
		controller.set(Config.GRABBER_ARM_UP_SPEED); // set motor at a positive value to operate the grabber arm
	}

	/**
	 * stops the grabber arm from moving by stopping the motor.
	 */
	public void stop() {
		controller.stopMotor(); // set motor speed at 0 to stop
	}

	/**
	 * drives the motor in reverse to operate the grabber arm in reverse
	 */
	public void down() {
		controller.set(Config.GRABBER_ARM_DOWN_SPEED); // set motor in reverse to make the grabber arm go down
	}
}
