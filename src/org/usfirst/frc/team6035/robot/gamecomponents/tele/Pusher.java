package org.usfirst.frc.team6035.robot.gamecomponents.tele;

import edu.wpi.first.wpilibj.VictorSP;
import org.usfirst.frc.team6035.robot.*;

/**
 * @author SKI The Pusher class is responsible for running the motor
 *         controlling the pusher.
 */
public class Pusher {
	private VictorSP motor = new VictorSP(Config.PUSHER_CHANNEL);
	private SoftSpeedController controller = new SoftSpeedController(motor);

	/**
	 * is meant to push the box by running the motor on a medium to fast speed.
	 */
	public void push() {
		controller.set(Config.PUSHER_PUSH_SPEED); 
	}

	/**
	 * stops the pusher from moving by stopping the motor.
	 */
	public void stop() {
		controller.stopMotor();
	}

	/**
	 * rewinds the pusher by reversing the motor.
	 */
	public void rewind() {
		controller.set(Config.PUSHER_REWIND_SPEED);
	}
}
