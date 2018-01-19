package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.VictorSP;

/**
 * @author Harrison 
 * The grabber class is responsible for running the motor controlling the grabber.
 */
public class Grabber {
	VictorSP motor = new VictorSP(Config.GRABBER_CHANNEL);
	SoftSpeedController controller = new SoftSpeedController(motor);

	/**
	 * is meant to grab the box by running the motor on a medium to fast speed.
	 */
	void grab() {
		controller.set(Config.GRABBER_GRAB_SPEED); // set motor at a lesser speed for robot to keep holding on to the box
	}

	/**
	 * stops the grabber from moving by stopping the motor.
	 */
	void stop() {
		controller.set(0);
	}

	/**
	 * opens the grabber by reversing the motor.
	 */
	void letgo() {
		controller.set(Config.GRABBER_LET_GO_SPEED);
	}

	/**
	 * helps the grabber hold onto the power-cube by running it at a low speed.
	 */
	void hold() {
		controller.set(Config.GRABBER_HOLD_SPEED);
	}
}
