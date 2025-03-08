package frc.lib.configs.Subsystems;

import com.ctre.phoenix6.hardware.CANcoder;

import frc.lib.Items.Controllers.TalonController;
import frc.lib.configs.Controllers.ControllerInfo;
import frc.robot.Constants;
import frc.robot.Constants.Swerve;

public class TalonModuleInfo {
    public int moduleNumber;
    public TalonController drive;
    public TalonController angle;
    public CANcoder cancoder;
    public double angleOffset;
    public double xPos;
    public double driveConvert;
    public double angleConvert;

    /**Requires the module to assign cancodes correctly
     * @param moduleNumber
     */

    public TalonModuleInfo(int moduleNumber){
        this.moduleNumber = moduleNumber;
        drive = new TalonController(Constants.Setup.driveMotors[moduleNumber], new ControllerInfo().driveKraken());
        angle = new TalonController(Constants.Setup.angleMotors[moduleNumber], new ControllerInfo().angleKraken());
        cancoder = new CANcoder(Constants.Setup.moduleCancoders[moduleNumber]);
        angleOffset = Constants.Setup.angleOffsets[moduleNumber];
        xPos = Constants.Setup.xposition[moduleNumber];
        driveConvert = Constants.ConversionFactors.driveConversionPositionFactor;
        angleConvert = Constants.ConversionFactors.angleConversionPositionFactorRotation;
    }
}
