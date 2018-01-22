package org.usfirst.frc.team6035.robot;

import edu.wpi.first.wpilibj.VictorSP;

/**
 * @author Ethan
 * Class for operating the Climber
 * 
 * */
public class Climber {
	VictorSP motor = new VictorSP(Config.CLIMBER_CHANNEL);
	SoftSpeedController controller = new SoftSpeedController(motor);
	
	/**
	 * sets the motor speed to operate the climber
	 */
	void up() {
		controller.set(Config.CLIMBER_UP_SPEED); // set motor at a positive value to operate the climber
	}

	/**
	 * stops the climber from moving by stopping the motor.
	 */
	void stop() {
		controller.stopMotor(); // set motor speed at 0 to stop
	}
}
