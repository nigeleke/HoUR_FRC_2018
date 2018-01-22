package org.usfirst.frc.team6035.robot;
import edu.wpi.first.wpilibj.smartdashboard.*;


/**
 * @author Gabriel Love
 * Class for getting autonomous selections from smart dashboard
 */

public class Dashboard {
	
	private int mode = 1; // initialize default mode
	private SendableChooser autoCommand;
	
	public void dashboardInit() {
		autoCommand = new SendableChooser();
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
	
	public void dashboardAutoInit() {
		mode = (int) autoCommand.getSelected();
	}
	
	public void dashboardAutoCase() {
		switch(mode) {
		case 1: 
		//TODO: add auto code for driving straight
		break;
		case 2: 
		//TODO: add auto code for LeftToLeftBlue
		break;
		case 3: 
		//TODO: add auto code for LeftToRightBlue
		break;
		case 4: 
		//TODO: add auto code for MiddleToLeftBlue
		break;
		case 5: 
		//TODO: add auto code MiddleToRightBlue
		break;
		case 6: 
		//TODO: add auto code RightToLeftBlue
		break;
		case 7: 
		//TODO: add auto code RightToRightBlue
		break;
		case 8: 
		//TODO: add auto code LeftToLeftRed
		break;
		case 9: 
		//TODO: add auto code LeftToRightRed
		break;
		case 10: 
		//TODO: add auto code MiddleToLeftRed
		break;
		case 11: 
		//TODO: add auto code MiddleToRightRed
		break;
		case 12: 
		//TODO: add auto code RightToLeftRed
		break;
		case 13: 
		//TODO: add auto code RightToRightRed
		break;
		
		}
	}
}
