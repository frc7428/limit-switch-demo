/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class PWM {
    public static final int ELEVATOR_MOTOR = 0;
  }

  // If your encoder is analog, you would use the analog inputs, instead.
  public static final class DIGITAL_INPUT {
    public static final int ELEVATOR_LOWER = 0;
    public static final int ELEVATOR_UPPER = 1;
  }

  public static final class USB {
    public static final int MECHANISM_JOYSTICK = 0;
  }

  public static final class MECHANISM_JOYSTICK_BUTTON {
    public static final int RAISE_ELEVATOR = 1;
    public static final int LOWER_ELEVATOR = 2;
  }
}
