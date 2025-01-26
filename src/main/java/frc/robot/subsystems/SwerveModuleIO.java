package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveModulePosition;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import frc.lib.math.OnboardModuleState;

public class SwerveModuleIO{
  public int moduleNumber;

  public final SwerveModuleState xState = null;
  
  public void setDesiredState(SwerveModuleState desiredState, boolean isOpenLoop) {
    // Custom optimize command, since default WPILib optimize assumes continuous controller which
    // REV and CTRE are not
    desiredState = OnboardModuleState.optimize(desiredState, getState().angle);
      setAngle(desiredState);
      setSpeed(desiredState, isOpenLoop);
  }

  public void resetToAbsolute() {
  }

  private void setSpeed(SwerveModuleState desiredState, boolean isOpenLoop) {
  }

  private void setAngle(SwerveModuleState desiredState) {
  }

  public Rotation2d getCanCoder() {
    return null;
  }

  public SwerveModuleState getState() {
    return null;
  }

  public SwerveModulePosition getPostion() {
    return null;
  }
}