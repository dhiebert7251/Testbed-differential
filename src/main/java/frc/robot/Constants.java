// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class DrivetrainConstants {
    //drive motor CAN addresses
    public static final int kFrontLeftMotorID = 20;
    public static final int kBackLeftMotorID = 21;
    public static final int kFrontRightMotorID = 22;
    public static final int kBackRightMotorID = 23;

    public static final boolean kFrontLeftMotorInverted = false;
    public static final boolean kBackLeftMotorInverted = false;
    public static final boolean kFrontRightMotorInverted = true;
    public static final boolean kBackRightMotorInverted = true;

    public static final int kFrontLeftEncoderA = 0;
    public static final int kFrontLeftEncoderB = 1;
    public static final int kBackLeftEncoderA = 2;
    public static final int kBackLeftEncoderB = 3;
    public static final int kFrontRightEncoderA = 4;
    public static final int kFrontRightEncoderB = 5;
    public static final int kBackRightEncoderA = 6;
    public static final int kBackRightEncoderB = 7
    ;


  }

  public static class PhysicalConstants {

    public static final double kMotorFreeSpeed = 5330.0; //CIM motor
    public static final double kDriveGearRatio = 1/12.75; //Toughbox Micro
    public static final double kWheelDiameter = Units.inchesToMeters(8); //pneumatic wheels
    //public static final double kWheelDiameter = Units.inchesToMeters(6); //meccanum or Hi-Tec traction wheels
    public static final double kMaxSpeed = (kMotorFreeSpeed*kDriveGearRatio/60)*(Math.PI*kWheelDiameter); // meters per second
    public static final double kMaxAngularSpeed = 2 * Math.PI; // one rotation per second
  
    private static final double kTrackWidth = Units.inchesToMeters(33.12); // from drawing
    private static final double kWheelBase = Units.inchesToMeters(19.945); // from drawing
    private static final double kWheelRadius = kWheelDiameter/2; // meters
    private static final int kEncoderResolution = 80; //CIMcoder (20 per channel quadrature) - TODO:is this correct?
  }
}
