package org.usfirst.frc.team6035.robot.auto;


/**
 * autonomous for base paths
 * @author SKI
 *
 */
public abstract class AutoDirection {
/**
 * 
 * @return number of steps to be executed in the autonomous path
 */
	public abstract int nSteps();
/**
 * 
 * @param i
 * @return how fast the drive train runs left at feet per second at the i'th step
 */
	public abstract double leftSpeed(int i);
	/**
	 * 
	 * @param i
	 * @return how fast the drive train runs right at feet per second at the i'th step
	 */
	public abstract double rightSpeed(int i);

	
}
