package org.usfirst.frc.team6035.robot.gamecomponents.auto;

import org.usfirst.frc.team6035.robot.Config;
import org.usfirst.frc.team6035.robot.gamecomponents.tele.*;

public class LiftToSwitchPosition implements AutoCommand{

	private Lift lift;
	private int stepNumber;
	
	public LiftToSwitchPosition(Lift lift) {
		this.lift = lift;
	}
	
	@Override
	public void init() {
		stepNumber = 0;
	}

	@Override
	public void doNextAction() {
		lift.up();
	}

	@Override
	public boolean isFinished() {
		return (stepNumber == Config.LIFT_TO_SWITCH_POSITION_STEPS);
	}

}
