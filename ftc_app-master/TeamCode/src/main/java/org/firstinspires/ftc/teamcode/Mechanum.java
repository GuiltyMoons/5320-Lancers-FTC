package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by cao on 11/9/2016.
 */
@TeleOp(name = "dude333", group = "dude444")
public class Mechanum extends OpMode {
    Robot robot = new Robot();



    double leftMotor;
    double leftMotor2;
    double rightMotor;
    double rightMotor2;

    @Override
    public void init() {
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {

        double x1 = gamepad1.left_stick_x;
        double y1 = gamepad1.left_stick_y;

        double x2 = gamepad1.right_stick_y;

        double pow = Math.hypot(x1, y1);

        double angle = Math.PI - Math.atan2(y1, -x1);

        double moveAngle = x2;

        if (Math.abs(x1) > 0.1 && Math.abs(y1) > 0.1) {
            leftMotor = pow * Math.sin(moveAngle + (Math.PI / 4) - angle);
            rightMotor = pow * Math.cos(moveAngle + (Math.PI / 4) - angle);
            leftMotor2 = (pow * Math.cos(moveAngle + (Math.PI / 4))) + angle;
            rightMotor2 = (pow * Math.sin(moveAngle + (Math.PI / 4))) + angle;

            robot.leftMotor.setPower(leftMotor);
            robot.rightMotor.setPower(rightMotor);
            robot.leftMotor2.setPower(leftMotor2);
            robot.rightMotor2.setPower(rightMotor2);
        } else {
            robot.leftMotor.setPower(0);
            robot.leftMotor2.setPower(0);
            robot.rightMotor.setPower(0);
            robot.rightMotor2.setPower(0);
        }
    }
}