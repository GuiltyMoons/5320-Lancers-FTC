package org.firstinspires.ftc.teamcode;

import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
/**
 * Created by cao on 10/31/2016.
 */

@Autonomous(name  = "dudy", group = "dudy2")
public class Auto extends LinearOpMode {
    Robot robot = new Robot();
    ElapsedTime time = new ElapsedTime();


    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);

        while (!isStarted()) {
            idle();
        }
        time.reset();
        while (time.seconds() < 2.5) {
            robot.moveAll(1);
        }
    }
}
