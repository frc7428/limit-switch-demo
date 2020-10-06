/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ElevatorSubsystem extends SubsystemBase {
  private final SpeedController mElevatorMotor = new PWMVictorSPX(Constants.PWM.ELEVATOR_MOTOR);

  private final DigitalInput mLowerLimit = new DigitalInput(Constants.DIGITAL_INPUT.ELEVATOR_LOWER);
  private final DigitalInput mUpperLimit = new DigitalInput(Constants.DIGITAL_INPUT.ELEVATOR_UPPER);

  /**
   * Creates a new ElevatorSubsystem.
   */
  public ElevatorSubsystem() {
  }

  /**
   * In the raise method, we only want to raise if we are below the max!
   */
  public void raise() {
    // We assume that the limit switch being pressed
    // returns a true value. Since limit switches can be open
    // or closed normally, you may need to invert this (!mUpperLimit.get())
    // or swap the leads on the switch.

    // Here, if we want to raise and the upper limit is triggered,
    // we want to stop. Otherwise, we can go. And we don't care about the lower
    // limit. This only works if moving past (up and beyond) the upper limit
    // does not un-set the limit switch.
    if (mUpperLimit.get()) {
      stop();
    } else {
      mElevatorMotor.set(1);
    }

  }

  /**
   * In the lower method, we only want to lower if we are above the min!
   */
  public void lower() {
    // We assume that the limit switch being pressed
    // returns a true value. Since limit switches can be open
    // or closed normally, you may need to invert this (!mLowerLimit.get())
    // or swap the leads on the switch.

    // Here, if we want to lower and the lower limit is triggered,
    // we want to stop. Otherwise, we can go. And we don't care about the upper
    // limit. This only works if moving past (down and below) the lower limit
    // does not un-set the limit switch.
    if (mLowerLimit.get()) {
      stop();
    } else {
      mElevatorMotor.set(-1);
    }
  }

  public void stop() {
    mElevatorMotor.stopMotor();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
