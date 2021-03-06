// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // CONTROLLERS
    public final static int BIGBOI = 1;
    public final static int XBOX = 0;

    // MOTORS
    public final static int MOTOR1 = 0;
    public final static int MOTOR2 = 1;
    public final static int MOTOR3 = 2;
    public final static int MOTOR4 = 3;

    // SENSOR PORTS
    public final static int RELAY_PORT = 1;
    public final static int ENCODER_PORT_1 = 2;
    public final static int ENCODER_PORT_2 = 3;

    // SPEEDS
    public final static double ENCODER_SPEED = 0.3;
    public final static double DRIVE_TO_WALL_MAX = 0.6;
    public final static double DRIVE_TO_WALL_MIN = 0.3;
    public final static double GYRO_TURN_MAX = 0.7;
    public final static double GYRO_TURN_MIN = 0.35;
    public final static double DRIVE_FOR_TIME_SPEED = 0.5;

    // OTHER
    public final static int ENCODER_COUNTS_PER_REV = 2048;
    public final static int WHEEL_DIAMETER = 6;
    
    // How much time the relay stays on
    public final static double RELAY_STOP_TIME = 0.5;

}
