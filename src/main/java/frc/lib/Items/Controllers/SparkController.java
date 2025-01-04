package frc.lib.Items.Controllers;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import frc.lib.configs.Controllers.SparkControllerInfo;

public class SparkController {
    public SparkMax spark;
    public RelativeEncoder sparkEncode;
    public SparkClosedLoopController sparkControl;
    public final int canbusNumber;
    private double max = 1;
    private double min = -1;
    public double fLim = 0;
    public double bLim = 0;
    public boolean fEnable = false;
    public boolean bEnable = false;


    /* Creates and Configures the Sparkmax Controller*/
    public SparkController(int canbusNumber, SparkControllerInfo Info){
        this.canbusNumber = canbusNumber;
        spark = new SparkMax(canbusNumber, MotorType.kBrushless);
        sparkEncode = spark.getEncoder();
        sparkControl = spark.getClosedLoopController();
        configureSpark(Info.configNeo);
     }

    /* Creates and Configures the Sparkmax Controller Note: Pass null to N/A fields */
    public SparkController(int canbusNumber, SparkControllerInfo Info, Double min, Double max, Double fLim, Double bLim){
    this.canbusNumber = canbusNumber;
    if(max != null){
        this.max = max;
    }
    if(min != null){
        this.min = min;
    }
    if(fLim != null){
        this.fLim = fLim;
        fEnable = true;
    }
    if(bLim != null){
        this.bLim = bLim;
        bEnable = true;
    }

    spark = new SparkMax(canbusNumber, MotorType.kBrushless);
    sparkEncode = spark.getEncoder();
    sparkControl = spark.getClosedLoopController();
    configureSpark(Info.configNeo);
    }

    /* Sets and Flashes the Sparkmax to Passed States */
    public void configureSpark(SparkMaxConfig config){
        spark.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
        sparkEncode.setPosition(0.0);    
    }
    
}
