package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * Created by cao on 1/14/2017.
 */
/*
@Autonomous(name = "Staight")
public class DrivingStraightAuto extends LinearOpMode {
    double leftSpeed = 1, rightSpeed = 1;
    Robot robot = new Robot();
    ElapsedTime time = new ElapsedTime();
    double lastError = 0;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        robot.gyro.calibrate();

        while (!isStarted()) {
            idle();
        }
        time.reset();
        while (robot.gyro.isCalibrating()) {
            robot.stop();
        }
        time.reset();
        while (time.seconds() < 4) {
            robot.tankDrive(moveStraight(-.5, 0)[0], moveStraight(-.5, 0)[1]);
            //robot.tankDrive(-motorPIDSpeed(0), -rightSpeed);
            // }
            telemetry.addData("Ange", robot.gyro.getIntegratedZValue());
            telemetry.update();
        }
        robot.stop();
    }

    public double[] moveStraight(double defaultPower, double targetHeading) {
        double[] motorSpeed = new double[2];

        motorSpeed[0] = Range.clip((defaultPower + (robot.gyro.getIntegratedZValue() - targetHeading) / 100), -1, 1);
        motorSpeed[1] = Range.clip((defaultPower - (robot.gyro.getIntegratedZValue() - targetHeading) / 100), -1, 1);

        return motorSpeed;
    }

    public double motorPIDSpeed(double targetHeading){
        double error = targetHeading - robot.gyro.getIntegratedZValue();
        rightSpeed += error * 0.5;
        rightSpeed += lastError * 0.5;
        lastError = error;
        return Range.clip(rightSpeed, -1, 1);
    }
}

*/