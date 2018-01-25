package org.usfirst.frc.team6035.robot.gamecomponents.auto;

public interface AutoCommand {

	void init();
	void doNextAction();
	boolean isFinished();
	
}
