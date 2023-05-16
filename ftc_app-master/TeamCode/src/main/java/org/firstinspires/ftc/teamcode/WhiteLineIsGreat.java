package org.firstinspires.ftc.teamcode;

import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by cao on 1/13/2017.
 */
@Autonomous(name  = "GreatWhiteLine")
public class WhiteLineIsGreat extends LinearOpMode {
    Robot robot = new Robot();
    ColorSensor color;
    ColorSensor color2;
    ElapsedTime time = new ElapsedTime();
    Arm arm = new Arm();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        arm.init(hardwareMap);
        color = hardwareMap.colorSensor.get("color");
        color2 = hardwareMap.colorSensor.get("color2");

        while (isStarted()) {
            idle();
        }
        time.reset();
        while (time.seconds() < 2) {
            robot.move(-1, -1, -1, -1);
        }
        time.reset();
        while (time.seconds() < 1) {
            robot.move(1, 1, -1, -1);
        }
    }
}