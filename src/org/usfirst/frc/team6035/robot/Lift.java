package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.VictorSP;

/**
 * @author Harrison King
 * Class for operating the lift
 */
public class Lift {
	VictorSP motor = new VictorSP(5);
	SoftSpeedController controller = new SoftSpeedController(motor);
	
	/**
	 * sets the motor speed to operate the lift
	 */
	void up() {
		controller.set(0.2); // set motor at a positive value to operate the lift
	}

	/**
	 * stops the lift from moving by stopping the motor.
	 */
	void stop() {
		controller.set(0); // set motor speed at 0 to stop
	}

	/**
	 * drives the motor in reverse to operate the lift in reverse
	 */
	void down() {
		controller.set(-0.2); // set motor in reverse to go down
	}

}
