package frc.lib.configs.Controllers;

import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkFlexConfig;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
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
    public SparkBaseConfig config = null;

    public SparkControllerInfo driveNeo(){
        currentLim = Electical.driveCurrentLim;
        invert = Setup.driveInvert;
        idleMode = IdleModes.driveSparkIdle;
        posConversion = ConversionFactors.driveConversionPositionFactor;
        velConversion = ConversionFactors.driveConversionVelocityFactor;
        pidList = PID.driveNeoPID;
        voltageComp = Electical.voltageComp;

        config = new SparkMaxConfig();
            config
                .inverted(invert)
                .idleMode(idleMode)
                .smartCurrentLimit(currentLim, currentLim)
                .voltageCompensation(voltageComp);
            config.encoder
                .positionConversionFactor(posConversion)
                .velocityConversionFactor(velConversion);
            config.closedLoop
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

        config = new SparkMaxConfig();
        config
            .inverted(invert)
            .idleMode(idleMode);
        config.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        config.closedLoop
            .feedbackSensor(FeedbackSensor.kPrimaryEncoder)
            .pidf(pidList[0], pidList[1], pidList[2], pidList[3]);
        
        return this;
    }

    public SparkControllerInfo driveVortexMax(){
        currentLim = Electical.driveCurrentLim;
        invert = Setup.driveInvert;
        idleMode = IdleModes.driveSparkIdle;
        posConversion = ConversionFactors.driveConversionPositionFactor;
        velConversion = ConversionFactors.driveConversionVelocityFactor;
        pidList = PID.driveVortexPID;
        voltageComp = Electical.voltageComp;

        config = new SparkMaxConfig();
        config
            .inverted(invert)
            .idleMode(idleMode);
        config.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        config.closedLoop
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

        config = new SparkFlexConfig();
        config
            .inverted(invert)
            .idleMode(idleMode);
        config.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        config.closedLoop
            .feedbackSensor(FeedbackSensor.kPrimaryEncoder)
            .pidf(pidList[0], pidList[1], pidList[2], pidList[3]);

        return this;
    }

    public SparkControllerInfo angleVortexMax(){
        currentLim = Electical.angleCurrentLim;
        invert = Setup.angleInvert;
        idleMode = IdleModes.angleSparkIdle;
        posConversion = ConversionFactors.angleConversionPositionFactor;
        velConversion = ConversionFactors.angleConversionVelocityFactor;
        pidList = PID.angleVortexPID;
        voltageComp = Electical.voltageComp;

        config = new SparkMaxConfig();
        config
            .inverted(invert)
            .idleMode(idleMode);
        config.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        config.closedLoop
            .feedbackSensor(FeedbackSensor.kPrimaryEncoder)
            .pidf(pidList[0], pidList[1], pidList[2], pidList[3]);

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

        config = new SparkFlexConfig();
        config
            .inverted(invert)
            .idleMode(idleMode);
        config.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        config.closedLoop
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
