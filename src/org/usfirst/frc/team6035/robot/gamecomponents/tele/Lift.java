package org.usfirst.frc.team6035.robot.gamecomponents.tele;

import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team6035.robot.*;

/**
 * @author Harrison King Class for operating the lift
 */
public class Lift {
	private VictorSP motor1 = new VictorSP(Config.LIFT_CHANNEL_1);
	private VictorSP motor2 = new VictorSP(Config.LIFT_CHANNEL_2);
	private SpeedController motors = new SpeedControllerGroup(motor1, motor2);
	
	private SoftSpeedController controller = new SoftSpeedController(motors);
	private SoftSpeedController superSoftController = new SoftSpeedController(motors, Config.LIFT_UP_RAMP_UP_TIME_MS);

	/**
	 * sets the motor speed to operate the lift
	 */
	public void up() {
		superSoftController.set(Config.LIFT_UP_SPEED); // set motor at a positive value to operate the lift
	}

	/**
	 * stops the lift from moving by stopping the motor.
	 */
	public void stop() {
		controller.stopMotor(); // set motor speed at 0 to stop
	}

	/**
	 * drives the motor in reverse to operate the lift in reverse
	 */
	public void down() {
		controller.set(Config.LIFT_DOWN_SPEED); // set motor in reverse to go down
	}

	public void compensate() {
		controller.set(Config.LIFT_COMPENSATE_SPEED);
	}
}
