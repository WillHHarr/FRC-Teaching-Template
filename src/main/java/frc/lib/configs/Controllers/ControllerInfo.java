package frc.lib.configs.Controllers;

import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import frc.robot.Constants.*;

public class ControllerInfo {
    public int currentLim;
    public boolean invert;
    public IdleMode idleMode;
    public double posConversion;
    public double velConversion;
    public double[] pidList;
    public double voltageComp;
    public SparkBaseConfig sparkConfig;
    public TalonFXConfiguration talonConfig;

    public ControllerInfo driveNeo(){
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

    public ControllerInfo angleNeo(){
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

    public ControllerInfo driveVortex(){
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

    public ControllerInfo driveVortexFlex(){
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

    public ControllerInfo angleVortex(){
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

    public ControllerInfo angleVortexFlex(){
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

    public ControllerInfo driveKraken(){
        currentLim = Electical.driveCurrentLim;
        invert = Setup.driveInvert;
        idleMode = IdleModes.driveSparkIdle;
        posConversion = ConversionFactors.driveConversionPositionFactor;
        velConversion = ConversionFactors.driveConversionVelocityFactor;
        pidList = PID.driveKrakenPID;
        voltageComp = Electical.voltageComp;

        talonConfig = new TalonFXConfiguration();

        talonConfig.Slot0.kP = pidList[0];
        talonConfig.Slot0.kD = pidList[1];
        talonConfig.Slot0.kD = pidList[2];
        talonConfig.Slot0.kS = pidList[4];
        talonConfig.Slot0.kV = pidList[5];
        talonConfig.MotionMagic.MotionMagicExpo_kA = pidList[6];
        talonConfig.CurrentLimits.SupplyCurrentLimit = currentLim;

        return this;
    }

    public ControllerInfo angleKraken(){
        currentLim = Electical.angleCurrentLim;
        invert = Setup.angleInvert;
        idleMode = IdleModes.angleSparkIdle;
        posConversion = ConversionFactors.angleConversionPositionFactor;
        velConversion = ConversionFactors.angleConversionVelocityFactor;
        pidList = PID.angleKrakenPID;
        voltageComp = Electical.voltageComp;

        talonConfig = new TalonFXConfiguration();

        talonConfig.Slot0.kP = pidList[0];
        talonConfig.Slot0.kD = pidList[1];
        talonConfig.Slot0.kD = pidList[2];
        talonConfig.Slot0.kS = pidList[4];
        talonConfig.Slot0.kV = pidList[5];
        talonConfig.MotionMagic.MotionMagicExpo_kA = pidList[6];
        talonConfig.CurrentLimits.SupplyCurrentLimit = currentLim;
        talonConfig.Feedback.SensorToMechanismRatio = posConversion;

        return this;
    }

}
