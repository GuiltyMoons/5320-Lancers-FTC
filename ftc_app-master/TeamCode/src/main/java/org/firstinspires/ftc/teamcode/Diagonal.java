package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by cao on 1/27/2017.
 */
@Autonomous(name = "diagonal")
public class Diagonal extends LinearOpMode {
    Robot robot = new Robot();
    Arm arm = new Arm();
    ColorSensor color2;
    ElapsedTime time = new ElapsedTime();
    boolean isRed = false;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        arm.init(hardwareMap);
        color2 = hardwareMap.colorSensor.get("color2");

        while (!isStarted()) {
            idle();
        }
        time.reset();
        while (time.seconds() < 2) {
            robot.move(-1, -1, -1, -1);
        }
    }
}