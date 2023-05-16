package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by cao on 11/5/2016.
 */

public class Intake {

    DcMotor intakeMotor = null;


    public void init(HardwareMap hwMap) {

        intakeMotor = hwMap.dcMotor.get("intakeMotor");

        intakeMotor.setDirection(DcMotor.Direction.REVERSE);

    }

    public void intakeIn(double surgIn) {
        intakeMotor.setPower(surgIn);
    }

    public void intakeStop() {
        intakeMotor.setPower(0);
    }
}