package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by cao on 11/5/2016.
 */

public class Conveyor {
    
    DcMotor conveyor = null;

    public void init(HardwareMap hwMap) {

        conveyor = hwMap.dcMotor.get("conveyor");

        conveyor.setDirection(DcMotor.Direction.FORWARD);
    }
    public void conveyorIn(double conIn) {
        conveyor.setPower(conIn);
    }
    public void conveyorStop() {
        conveyor.setPower(0);
    }
}

