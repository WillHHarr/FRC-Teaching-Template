package frc.lib.configs.Controllers;

import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import frc.robot.Constants.*;

public class SparkControllerInfo {
    public int currentLim;
    public boolean invert;
    public IdleMode idleMode;
    public double posConversion;
    public double velConversion;
    public double[] pidList;
    public double voltageComp;
    public SparkBaseConfig sparkConfig;
    public TalonFXConfiguration talonConfig;

    public SparkControllerInfo driveNeo(){
        currentLim = Electical.driveCurrentLim;
        invert = Setup.driveInvert;
        idleMode = IdleModes.driveSparkIdle;
        posConversion = ConversionFactors.driveConversionPositionFactor;
        velConversion = ConversionFactors.driveConversionVelocityFactor;
        pidList = PID.driveNeoPID;
        voltageComp = Electical.voltageComp;

        sparkConfig = new SparkMaxConfig();
        sparkConfig
            .inverted(invert)
            .idleMode(idleMode)
            .smartCurrentLimit(currentLim)
            .voltageCompensation(voltageComp);
        sparkConfig.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        sparkConfig.closedLoop
            .feedbackSensor(FeedbackSensor.kPrimaryEncoder)
            .pidf(pidList[0], pidList[1], pidList[2], pidList[3]);

        return this;
    }

    public SparkControllerInfo angleNeo(){
        currentLim = Electical.angleCurrentLim;
        invert = Setup.angleInvert;
        idleMode = IdleModes.angleSparkIdle;
        posConversion = ConversionFactors.angleConversionPositionFactor;
        velConversion = ConversionFactors.angleConversionVelocityFactor;
        pidList = PID.angleNeoPID;
        voltageComp = Electical.voltageComp;

        sparkConfig = new SparkMaxConfig();
        sparkConfig
            .inverted(invert)
            .idleMode(idleMode)
            .smartCurrentLimit(currentLim)
            .voltageCompensation(voltageComp);
        sparkConfig.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        sparkConfig.closedLoop
            .feedbackSensor(FeedbackSensor.kPrimaryEncoder)
            .pidf(pidList[0], pidList[1], pidList[2], pidList[3]);

        return this;
    }

    public SparkControllerInfo driveVortex(){
        currentLim = Electical.driveCurrentLim;
        invert = Setup.driveInvert;
        idleMode = IdleModes.driveSparkIdle;
        posConversion = ConversionFactors.driveConversionPositionFactor;
        velConversion = ConversionFactors.driveConversionVelocityFactor;
        pidList = PID.driveVortexPID;
        voltageComp = Electical.voltageComp;

        sparkConfig = new SparkMaxConfig();
        sparkConfig
            .inverted(invert)
            .idleMode(idleMode)
            .smartCurrentLimit(currentLim)
            .voltageCompensation(voltageComp);
        sparkConfig.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        sparkConfig.closedLoop
            .feedbackSensor(FeedbackSensor.kPrimaryEncoder)
            .pidf(pidList[0], pidList[1], pidList[2], pidList[3]);

        return this;
    }

    public SparkControllerInfo driveVortexFlex(){
        currentLim = Electical.driveCurrentLim;
        invert = Setup.driveInvert;
        idleMode = IdleModes.driveSparkIdle;
        posConversion = ConversionFactors.driveConversionPositionFactor;
        velConversion = ConversionFactors.driveConversionVelocityFactor;
        pidList = PID.driveVortexPID;
        voltageComp = Electical.voltageComp;

        sparkConfig = new SparkMaxConfig();
        sparkConfig
            .inverted(invert)
            .idleMode(idleMode)
            .smartCurrentLimit(currentLim)
            .voltageCompensation(voltageComp);
        sparkConfig.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        sparkConfig.closedLoop
            .feedbackSensor(FeedbackSensor.kPrimaryEncoder)
            .pidf(pidList[0], pidList[1], pidList[2], pidList[3]);

        return this;
    }

    public SparkControllerInfo angleVortex(){
        currentLim = Electical.angleCurrentLim;
        invert = Setup.angleInvert;
        idleMode = IdleModes.angleSparkIdle;
        posConversion = ConversionFactors.angleConversionPositionFactor;
        velConversion = ConversionFactors.angleConversionVelocityFactor;
        pidList = PID.angleVortexPID;
        voltageComp = Electical.voltageComp;

        sparkConfig = new SparkMaxConfig();
        sparkConfig
            .inverted(invert)
            .idleMode(idleMode)
            .smartCurrentLimit(currentLim);
        sparkConfig.absoluteEncoder
            .inverted(invert)
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        sparkConfig.closedLoop
            .feedbackSensor(FeedbackSensor.kAbsoluteEncoder)
            .pidf(pidList[0], pidList[1], pidList[2], pidList[3])
            .outputRange(-1, 1)
            .positionWrappingEnabled(true)
            .positionWrappingInputRange(0, posConversion);
        

        return this;
    }

    public SparkControllerInfo angleVortexFlex(){
        currentLim = Electical.angleCurrentLim;
        invert = Setup.angleInvert;
        idleMode = IdleModes.angleSparkIdle;
        posConversion = ConversionFactors.angleConversionPositionFactor;
        velConversion = ConversionFactors.angleConversionVelocityFactor;
        pidList = PID.angleVortexPID;
        voltageComp = Electical.voltageComp;

        sparkConfig = new SparkMaxConfig();
        sparkConfig
            .inverted(invert)
            .idleMode(idleMode)
            .smartCurrentLimit(currentLim)
            .voltageCompensation(voltageComp);
        sparkConfig.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        sparkConfig.closedLoop
            .feedbackSensor(FeedbackSensor.kPrimaryEncoder)
            .pidf(pidList[0], pidList[1], pidList[2], pidList[3]);

        return this;
    }

    public SparkControllerInfo driveKraken(){
        currentLim = Electical.driveCurrentLim;
        invert = Setup.driveInvert;
        idleMode = IdleModes.driveSparkIdle;
        posConversion = ConversionFactors.driveConversionPositionFactor;
        velConversion = ConversionFactors.driveConversionVelocityFactor;
        pidList = PID.driveKrakenPID;
        voltageComp = Electical.voltageComp;
        return this;
    }

    public SparkControllerInfo angleKraken(){
        currentLim = Electical.angleCurrentLim;
        invert = Setup.angleInvert;
        idleMode = IdleModes.angleSparkIdle;
        posConversion = ConversionFactors.angleConversionPositionFactor;
        velConversion = ConversionFactors.angleConversionVelocityFactor;
        pidList = PID.angleKrakenPID;
        voltageComp = Electical.voltageComp;
        return this;
    }

}
