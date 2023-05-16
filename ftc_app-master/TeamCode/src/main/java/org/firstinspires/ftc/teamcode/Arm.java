package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by cao on 12/16/2016.
 */

public class Arm {
   Servo clickerUpper;
    Servo clickerBottom;

    public void init(HardwareMap hwMap) {

        clickerUpper = hwMap.servo.get("clickerUpper");
        clickerBottom = hwMap.servo.get("clickerBottom");

        clickerUpper.setDirection(Servo.Direction.REVERSE);
        clickerBottom.setDirection(Servo.Direction.FORWARD);
    }
}
