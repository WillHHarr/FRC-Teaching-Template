package frc.lib.Items.Controllers;

import com.ctre.phoenix6.hardware.TalonFX;

import frc.lib.configs.Controllers.ControllerInfo;

public class TalonController {
    public TalonFX talon;
    public final int canbusNumber;

    public TalonController(int canbusNumber, ControllerInfo Info){
        this.canbusNumber = canbusNumber;
        talon = new TalonFX(canbusNumber);
        talon.getConfigurator().apply(Info.talonConfig);
    }
}
