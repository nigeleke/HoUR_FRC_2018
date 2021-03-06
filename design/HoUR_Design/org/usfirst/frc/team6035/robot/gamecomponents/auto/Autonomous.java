package org.usfirst.frc.team6035.robot.gamecomponents.auto;

import java.util.ArrayList;
import java.util.List;
import org.usfirst.frc.team6035.robot.auto.AutoDirection;
import org.usfirst.frc.team6035.robot.gamecomponents.tele.*;

public class Autonomous {

	private List<AutoCommand> commandSequence = new ArrayList<>();
	private int currentCommandIndex = 0;

	public Autonomous(DriveBase driveBase, GrabberArm grabberArm, Grabber grabber, Lift lift, AutoDirection direction) {
		//commandSequence.add(new LowerGrabberArm(grabberArm));
		//commandSequence.add(new GrabCube(grabber));
		//commandSequence.add(new RaiseGrabberArmToDrivePosition(grabberArm));
		commandSequence.add(new AutonomousDrive(driveBase, direction));
		//commandSequence.add(new LiftToSwitchPosition(lift));
		//commandSequence.add(new LowerGrabberArmToDropPosition(grabberArm));
		//commandSequence.add(new DropCube(grabber));

		commandSequence.get(0).init();
	}

	public void doNextAction() {
		if (currentCommandIndex < commandSequence.size()) {
			AutoCommand currentCommand = commandSequence.get(currentCommandIndex);
			currentCommand.doNextAction();

			if (currentCommand.isFinished()) {
				currentCommandIndex++;
				commandSequence.get(currentCommandIndex).init();
			}
		}
	}

}
