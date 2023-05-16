package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by cao on 1/11/2017.
 */

public class GyroTest extends LinearOpMode {

    Robot robot = new Robot();
    ElapsedTime time = new ElapsedTime();
    GyroSensor gyro;
    int a;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        gyro.calibrate();

        while (!isStarted()) {
            idle();
        }
        time.reset();

        if (gyro.rawX() != 0 && gyro.rawY() != 0 && gyro.rawZ() != 0) {


            robot.move(1, 1, 1, 1);
            robot.move(1, 1, -1, -1);
            robot.move(-1, -1, 1, 1);
            robot.move(-1, -1, -1, -1);
        }else{
            robot.move(0,0,0,0);
        }

    }
}
