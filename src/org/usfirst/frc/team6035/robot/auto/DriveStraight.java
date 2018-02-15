package org.usfirst.frc.team6035.robot.auto;

public class DriveStraight extends AutoDirection {

  private double[] leftMotorSpeeds = {
    0.000000, 1.183219, 1.827726, 2.192350, 2.398633, 2.515336, 2.581360, 2.618712, 2.639844, 2.651799, 2.658562, 2.662389, 2.664554, 2.665778, 2.666471, 2.666863, 2.667085, 2.667210, 2.667281, 2.667321, 2.667344, 2.667357, 2.667364, 2.667368, 2.667371, 2.667372, 2.667373, 2.667373, 2.667373, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667373, 2.667373, 2.667373, 2.667372, 2.667371, 2.667368, 2.667364, 2.667357, 2.667344, 2.667321, 2.667281, 2.667210, 2.667085, 2.666863, 2.666471, 2.665778, 2.664554, 2.662389, 2.658562, 2.651799, 2.639844, 2.618712, 2.581360, 2.515336, 2.398633, 2.192350, 1.827726, 1.183219, 0.000000
  };

  private double[] rightMotorSpeeds = {
    0.000000, 1.183219, 1.827726, 2.192350, 2.398633, 2.515336, 2.581360, 2.618712, 2.639844, 2.651799, 2.658562, 2.662389, 2.664554, 2.665778, 2.666471, 2.666863, 2.667085, 2.667210, 2.667281, 2.667321, 2.667344, 2.667357, 2.667364, 2.667368, 2.667371, 2.667372, 2.667373, 2.667373, 2.667373, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667374, 2.667373, 2.667373, 2.667373, 2.667372, 2.667371, 2.667368, 2.667364, 2.667357, 2.667344, 2.667321, 2.667281, 2.667210, 2.667085, 2.666863, 2.666471, 2.665778, 2.664554, 2.662389, 2.658562, 2.651799, 2.639844, 2.618712, 2.581360, 2.515336, 2.398633, 2.192350, 1.827726, 1.183219, 0.000000
  };

  public int nSteps() {
    return leftMotorSpeeds.length;
  }

  public double leftSpeed(int i) {
    return leftMotorSpeeds[i];
  }

  public double rightSpeed(int i) {
    return rightMotorSpeeds[i];
  }

}
