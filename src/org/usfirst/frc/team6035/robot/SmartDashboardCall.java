package org.usfirst.frc.team6035.robot;
import edu.wpi.first.wpilibj.smartdashboard.*;


public class SmartDashboardCall {

	private static final String kDefaultAuto = "Default";
	private static final String AutoChoiceA = "Auto Choice A";
	private static final String AutoChoiceB = "Auto Choice B";
	private static final String AutoChoiceC = "Auto Choice C";
	private String m_autoSelected;
	private SendableChooser<String> m_chooser = new SendableChooser<>();
	Autonomous autonomous = new Autonomous();
	DriveBase driveBase = new DriveBase();
	
public void smartDashboardInit() {
	m_chooser.addDefault("Default Auto", kDefaultAuto);
	m_chooser.addObject("Auto Choice A", AutoChoiceA);
	m_chooser.addObject("Auto Choice B", AutoChoiceB);
	m_chooser.addObject("Auto Choice C", AutoChoiceC);
	SmartDashboard.putData("Auto choices", m_chooser);

	}

public void smartDashboardGet() {
	m_autoSelected = m_chooser.getSelected();
	//autoSelected = SmartDashboard.getString("Auto Selector",
	//defaultAuto);
	System.out.println("Auto selected: " + m_autoSelected);
	}

public void smartDashboardAuto() {
	switch (m_autoSelected) {
	case AutoChoiceA:
		// Put custom auto code here
		break;
	case AutoChoiceB:
		// Put custom auto code here
		break;
	case AutoChoiceC:
		// Put custom auto code here
		break;
	case kDefaultAuto:
	default:
		// Put default auto code here
		break;
		
		}
	}
}
