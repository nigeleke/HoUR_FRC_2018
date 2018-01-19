package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.VictorSP;

/**
 * @author Harrison King
 * Class to operate the grabber arm
 */
public class GrabberArm {
	VictorSP motor = new VictorSP(4);
	SoftSpeedController controller = new SoftSpeedController(motor);
	
	/**
	 * sets the motor speed to operate the grabber arm
	 */
	void up() {
		controller.set(0.2); // set motor at a positive value to operate the grabber arm
	}

	/**
	 * stops the grabber arm from moving by stopping the motor.
	 */
	void stop() {
		controller.set(0); // set motor speed at 0 to stop
	}

	/**
	 * drives the motor in reverse to operate the grabber arm in reverse
	 */
	void down() {
		controller.set(-0.2); // set motor in reverse to make the grabber arm go down
	}

}
