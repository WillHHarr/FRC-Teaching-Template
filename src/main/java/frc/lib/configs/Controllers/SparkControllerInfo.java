package frc.lib.configs.Controllers;

import com.revrobotics.spark.config.SparkMaxConfig;
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
    public SparkMaxConfig configNeo = null;
    public SparkFlexConfig configFlex = null;

    public SparkControllerInfo driveNeo(){
        currentLim = Electical.driveCurrentLim;
        invert = Setup.driveInvert;
        idleMode = IdleModes.driveSparkIdle;
        posConversion = ConversionFactors.driveConversionPositionFactor;
        velConversion = ConversionFactors.driveConversionVelocityFactor;
        pidList = PID.driveNeoPID;
        voltageComp = Electical.voltageComp;

        configNeo = new SparkMaxConfig();
            configNeo
                .inverted(invert)
                .idleMode(idleMode)
                .smartCurrentLimit(currentLim, currentLim)
                .voltageCompensation(voltageComp);
            configNeo.encoder
                .positionConversionFactor(posConversion)
                .velocityConversionFactor(velConversion);
            configNeo.closedLoop
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

        configNeo = new SparkMaxConfig();
        configNeo
            .inverted(invert)
            .idleMode(idleMode);
        configNeo.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        configNeo.closedLoop
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

        configFlex = new SparkFlexConfig();
        configFlex
            .inverted(invert)
            .idleMode(idleMode);
        configFlex.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        configFlex.closedLoop
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

        configFlex = new SparkFlexConfig();
        configFlex
            .inverted(invert)
            .idleMode(idleMode);
        configFlex.encoder
            .positionConversionFactor(posConversion)
            .velocityConversionFactor(velConversion);
        configFlex.closedLoop
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
