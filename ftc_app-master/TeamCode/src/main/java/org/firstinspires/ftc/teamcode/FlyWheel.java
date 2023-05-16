package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by cao on 11/5/2016.
 */

public class FlyWheel {

    DcMotor flyWheelLeft = null;
    DcMotor flyWheelRight = null;

    public void init(HardwareMap hwMap) {

        flyWheelLeft = hwMap.dcMotor.get("flyWheelRight");
        flyWheelRight = hwMap.dcMotor.get("flyWheelLeft");

        flyWheelLeft.setDirection(DcMotor.Direction.FORWARD);
        flyWheelRight.setDirection(DcMotor.Direction.REVERSE);
    }
}