package frc.lib.configs.Subsystems;

import com.ctre.phoenix6.hardware.CANcoder;

import frc.lib.Items.Controllers.SparkController;
import frc.lib.configs.Controllers.SparkControllerInfo;
import frc.robot.Constants;

public class SwerveModuleInfo {
    public int moduleNumber;
    public SparkController drive;
    public SparkController angle;
    public CANcoder cancoder;
    public double angleOffset;
    public double xPos;

    /**Requires the module to assign cancodes correctly
     * @param moduleNumber
     */

    public SwerveModuleInfo(int moduleNumber){
        this.moduleNumber = moduleNumber;
        drive = new SparkController(Constants.Setup.driveMotors[moduleNumber], new SparkControllerInfo().driveVortexMax());
        angle = new SparkController(Constants.Setup.angleMotors[moduleNumber], new SparkControllerInfo().angleNeo());
        cancoder = new CANcoder(Constants.Setup.moduleCancoders[moduleNumber]);
        angleOffset = Constants.Setup.angleOffsets[moduleNumber];
        xPos = Constants.Setup.xposition[moduleNumber];
    }
}
