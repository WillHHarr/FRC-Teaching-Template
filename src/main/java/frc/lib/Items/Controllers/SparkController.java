package frc.lib.Items.Controllers;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SoftLimitConfig;
import com.revrobotics.spark.config.SparkBaseConfig;
import frc.lib.configs.Controllers.SparkControllerInfo;

public class SparkController {
    public SparkMax spark;
    public RelativeEncoder sparkEncode;
    public SparkClosedLoopController sparkControl;
    public final int canbusNumber;

    /* Creates and Configures the Sparkmax Controller*/
    public SparkController(int canbusNumber, SparkControllerInfo Info){
        this.canbusNumber = canbusNumber;
        spark = new SparkMax(canbusNumber, MotorType.kBrushless);
        sparkEncode = spark.getEncoder();
        sparkControl = spark.getClosedLoopController();
        configureSpark(Info.config);
     }

    /* Creates and Configures the Sparkmax Controller Note: Pass null to N/A fields */
    public SparkController(int canbusNumber, SparkControllerInfo Info, Double min, Double max, Double fLim, Double bLim){
    this.canbusNumber = canbusNumber;

    SoftLimitConfig softLim = new SoftLimitConfig();

    if(max != null){
        Info.config.closedLoop.maxOutput(max);
    }
    if(min != null){
        Info.config.closedLoop.minOutput(min);
    }
    if(fLim != null){
        softLim.forwardSoftLimit(fLim);
        softLim.forwardSoftLimitEnabled(true);
    }
    if(bLim != null){
        softLim.reverseSoftLimit(bLim);
        softLim.reverseSoftLimitEnabled(true);
    }

    Info.config.softLimit.apply(softLim);

    spark = new SparkMax(canbusNumber, MotorType.kBrushless);
    sparkEncode = spark.getEncoder();
    sparkControl = spark.getClosedLoopController();
    
    configureSpark(Info.config);
    }

    /* Sets and Flashes the Sparkmax to Passed States */
    public void configureSpark(SparkBaseConfig config){
        spark.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
        sparkEncode.setPosition(0.0);    
    }
    
}
