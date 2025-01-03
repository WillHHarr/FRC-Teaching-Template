package frc.lib.configs.Controllers;

import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkFlexConfig;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import frc.lib.util.CANSparkMaxUtil.Usage;
import frc.robot.Constants.*;

public class SparkControllerInfo {
    public Usage canbusUse;
    public int currentLim;
    public boolean invert;
    public IdleMode idleMode;
    public double posConversion;
    public double velConversion;
    public double[] pidList;
    public double voltageComp;
    public SparkMaxConfig config = null;

    public SparkControllerInfo driveNeo(){
        canbusUse = Usages.driveSparkUsage;
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
                .idleMode(idleMode);
            config.encoder
                .positionConversionFactor(posConversion)
                .velocityConversionFactor(velConversion);
            config.closedLoop
                .feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                .pid(pidList[0], pidList[1], pidList[2]);

        return this;
    }

    public SparkControllerInfo angleNeo(){
        canbusUse = Usages.angleSparkUsage;
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
            .pid(pidList[0], pidList[1], pidList[2]);
        
        return this;
    }

    public SparkControllerInfo driveVortex(){
        canbusUse = Usages.driveSparkUsage;
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
            .pid(pidList[0], pidList[1], pidList[2]);

        return this;
    }

    public SparkControllerInfo angleVortex(){
        canbusUse = Usages.angleSparkUsage;
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
            .pid(pidList[0], pidList[1], pidList[2]);

        return this;
    }

    public SparkControllerInfo driveKraken(){
        canbusUse = Usages.driveSparkUsage;
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
        canbusUse = Usages.angleSparkUsage;
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
