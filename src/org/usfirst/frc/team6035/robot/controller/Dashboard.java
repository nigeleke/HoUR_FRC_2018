package org.usfirst.frc.team6035.robot.controller;
import edu.wpi.first.wpilibj.smartdashboard.*;
import org.usfirst.frc.team6035.robot.auto.*;


/**
 * @author Gabriel Love
 * Class for getting autonomous selections from smart dashboard
 */

public class Dashboard {
	
	private SendableChooser<AutoDirection> autoCommand = new SendableChooser<>();
	
	public void dashboardInit() {
		autoCommand.addDefault("DriveStraight", new DriveStraight());
		autoCommand.addObject("LeftToLeftBlue", new LeftToLeft());
		autoCommand.addObject("LeftToRightBlue", new LeftToRight());
		autoCommand.addObject("MiddleToLeftBlue", new MiddleToLeft());
		autoCommand.addObject("MiddleToRightBlue", new MiddleToRight());
		autoCommand.addObject("RightToLeftBlue", new RightToLeft());
		autoCommand.addObject("RightToRightBlue", new RightToRight());
		autoCommand.addObject("LeftToLeftRed", new RightToRight());
		autoCommand.addObject("LeftToRightRed", new RightToLeft());
		autoCommand.addObject("MiddleToLeftRed", new MiddleToRight());
		autoCommand.addObject("MiddleToRightRed", new MiddleToLeft());
		autoCommand.addObject("RightToLeftRed", new LeftToRight());
		autoCommand.addObject("RightToRightRed", new LeftToLeft());
		SmartDashboard.putData("Autonomous Selecter", autoCommand);
	}
	
	
	public AutoDirection dashboardAutoCase() {
		return (AutoDirection) autoCommand.getSelected();
	}
}
