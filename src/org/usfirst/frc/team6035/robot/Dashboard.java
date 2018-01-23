package org.usfirst.frc.team6035.robot;
import edu.wpi.first.wpilibj.smartdashboard.*;


/**
 * @author Gabriel Love
 * Class for getting autonomous selections from smart dashboard
 */

public class Dashboard {
	
	Autonomous auto;
	private int mode = 1; // initialize default mode
	private SendableChooser<Integer> autoCommand;
	
	public void dashboardInit() {
		autoCommand = new SendableChooser<Integer>();
		autoCommand.addDefault("DriveStraight", 1);
		autoCommand.addObject("LeftToLeftBlue", 2);
		autoCommand.addObject("LeftToRightBlue", 3);
		autoCommand.addObject("MiddleToLeftBlue", 4);
		autoCommand.addObject("MiddleToRightBlue", 5);
		autoCommand.addObject("RightToLeftBlue", 6);
		autoCommand.addObject("RightToRightBlue", 7);
		autoCommand.addObject("LeftToLeftRed", 8);
		autoCommand.addObject("LeftToRightRed", 9);
		autoCommand.addObject("MiddleToLeftRed", 10);
		autoCommand.addObject("MiddleToRightRed", 11);
		autoCommand.addObject("RightToLeftRed", 12);
		autoCommand.addObject("RightToRightRed", 13);
		SmartDashboard.putData("Autonomous Selecter", autoCommand);
	}
	
	public void dashboardGetAutoSelection() {
		mode = (int) autoCommand.getSelected();
	}
	
	public void dashboardAutoCase() {
		switch(mode) {
		case 1: 
		auto.Straight();
		break;
		case 2: 
		auto.LeftToLeft();
		break;
		case 3: 
		auto.LeftToRight();
		break;
		case 4: 
		auto.MiddleToLeft();
		break;
		case 5: 
		auto.MiddleToRight();
		break;
		case 6: 
		auto.RightToLeft();
		break;
		case 7: 
		auto.RightToRight();
		break;
		case 8: 
		auto.RightToRight();
		break;
		case 9: 
		auto.RightToLeft();
		break;
		case 10: 
		auto.MiddleToRight();
		break;
		case 11: 
		auto.MiddleToLeft();
		break;
		case 12: 
		auto.LeftToRight();
		break;
		case 13: 
		auto.LeftToLeft();
		break;
		
		}
	}
}
