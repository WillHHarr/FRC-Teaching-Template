package frc.robot;

import com.pathplanner.lib.config.ModuleConfig;
import com.pathplanner.lib.config.PIDConstants;
import com.pathplanner.lib.config.RobotConfig;
import com.pathplanner.lib.controllers.PPHolonomicDriveController;
import com.pathplanner.lib.controllers.PathFollowingController;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.math.util.Units;

public final class Constants {
    
    /* Used for Constants Used Once On Initialization of Robot or Subsystems */
    public final static class Setup {

        /* Swerve Module Ids and Constants */
        public static final int[] moduleIDs = new int[] {0, 1, 2, 3};
        public static final int[] driveMotors = new int[] {1, 3, 5, 7};
        public static final int[] angleMotors = new int[] {2, 4, 6, 8};
        public static final int[] moduleCancoders = new int[] {9, 10, 11, 12};
        public static final double[] angleOffsets = new double[] {9.6, -9.3, 13.3, -78.8};
        public static final double[] xposition = new double[] {45, 45, -45, -45};

        /* Swerve Motor Inverts */
        public static final boolean driveInvert = false;
        public static final boolean angleInvert = false; //Set false for MK4 modules and WCP modules
    
    }

    public final static class Swerve {
        public static final double stickDeadband = 0.07;

        /* driveNeotrain Calculation Constants */
        /* Input these units from center of swerve modules */
        public static final double trackWidth = Units.inchesToMeters(28);
        public static final double trackLength = Units.inchesToMeters(28);

        /* Input Current Wheel Diameter, Can Change Due To Amount Of Wear */
        public static final double wheelDiameter = 100.0 / 1000.0; // mm to m
        public static final double wheelCircimference = wheelDiameter * Math.PI;

        /* Gyro Direction Toggle */
        public static final boolean invertGyro = true; // Always ensure Gyro is CCW+ CW- (Clockwise is increasing rotation values)

        /* Cancoder Invert */
        public static final boolean canCoderInvert = true;

        /* Speed Settings */
        public static final double maxSpeed = 2; // meters per second
        public static final double maxAngularVelocity = 4.25; // radians per second

        /* Mk4i Module Gear Ratios L2*/
        //public static final double driveGearRatio = (6.75 / 1.0); // 6.75:1
        //public static final double angleGearRatio = (150.0 / 7.0); // 150:7
        
        /* Mk4 Module Gear Ratios L3 */
        public static final double driveGearRatio = (6.12); // 6.12:1
        public static final double angleGearRatio = (12.8); // 12.8:1

        /* WCP Module Gear Ratios ***NOT MARKED DOWN PROPERLY - FIND INFO*** */
        //public static final double driveGearRatio = (6.75 / 1.0); // 6.75:1
        //public static final double angleGearRatio = (150.0 / 7.0); // 150:7        

        /* Swerve Module Positions (Currently in solid rectangleNeo context) */
        public static final Translation2d[] modulePositions = new Translation2d[] {
            new Translation2d(trackLength / 2.0, trackWidth / 2.0),
            new Translation2d(trackLength / 2.0, -trackWidth / 2.0),
            new Translation2d(-trackLength / 2.0, trackWidth / 2.0),
            new Translation2d(-trackLength / 2.0, -trackWidth / 2.0)
        };

        /* Swerve Kinematics */
        public static final SwerveDriveKinematics swerveKinematics =
        new SwerveDriveKinematics(
            modulePositions[0],
            modulePositions[1],
            modulePositions[2],
            modulePositions[3]
        );

        /* driveNeo Motor Characterization Values */
        /* {Static, Velocity, Acceleration} */    
        public static final double[] driveMotorsSVA = new double[] {0.2, 2.03, 0.48};


        public static final PathFollowingController pathFollowerConfig = new PPHolonomicDriveController(
            new PIDConstants(5.0, 0, 0), // Translation constants 
            new PIDConstants(5.0, 0, 0) // Rotation constants 
            );

        //Extra Constatnts for RobotConfig
        private static final double COFToCarpet = 1.0;

        //Motor Config Files
        private static final DCMotor Neo = new DCMotor(Electical.voltageComp, 2.6, 105, 1.8, 5676.0/9.5492965964254, 1);
        private static final DCMotor Vortex = new DCMotor(Electical.voltageComp, 3.6, 211, 3.6, 6784/9.5492965964254, 1);
        private static final DCMotor Kraken = new DCMotor(Electical.voltageComp, driveGearRatio, angleGearRatio, COFToCarpet, 6000/9.5492965964254, 1);

        public static final RobotConfig config = 
        new RobotConfig(10,
                        10, 
                        new ModuleConfig(wheelDiameter, maxSpeed, COFToCarpet, Vortex, Electical.driveCurrentLim, 1), 
                        modulePositions);
    }

    public static final class AutoConstants {
        
        public static final double kPXController = 1;
        public static final double kPYController = 1;
        public static final double kPThetaController = 1;
    
    }

    public final static class Electical {

        /* Base 12 Volt System */
        public static final double voltageComp = 12.0;

        /* Swerve Electrical Limits */
        public static final int driveCurrentLim = 80;
        public static final int angleCurrentLim = 20;

    }

    public final static class PID {

        /* Format {P, I, D, FF} */

        /* Swerve PIDs */
        public static final double[] driveNeoPID = new double[] {0.3, 0.0, 0.0, 0.0};
        public static final double[] angleNeoPID = new double[] {0.00825, 0.0, 0.0, 0.0};

        //These PIDS are not tuned
        public static final double[] driveVortexPID = new double[] {0.1, 0.0, 0.0, 0.0};
        public static final double[] angleVortexPID = new double[] {0.01, 0.0, 0.0, 0.0};

        public static final double[] driveKrakenPID = new double[] {0.3, 0.0, 0.0, 0.0};
        public static final double[] angleKrakenPID = new double[] {0.01, 0.0, 0.0, 0.0};

    }

    public final static class ConversionFactors {
        /* All numbers in 1 output to required input, or one wheel spin to motor spin */

        /* Swerve drive Conversions */
        public static final double driveConversionPositionFactor = Swerve.wheelCircimference / Swerve.driveGearRatio;
        public static final double driveConversionVelocityFactor = driveConversionPositionFactor / 60 ; //rpm to rps
        
        public static final double angleConversionPositionFactor = 360.0 / Swerve.angleGearRatio;
        public static final double angleConversionVelocityFactor = angleConversionPositionFactor / 60 ; //rpm to rps

    }

    public final static class IdleModes {
        
        /* Swerve Idles */
        public static final IdleMode driveSparkIdle = IdleMode.kBrake;
        public static final IdleMode angleSparkIdle = IdleMode.kBrake;

    }

}
