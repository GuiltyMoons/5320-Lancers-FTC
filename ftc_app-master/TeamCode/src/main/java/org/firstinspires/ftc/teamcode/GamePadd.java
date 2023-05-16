package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by cao on 10/30/2016.
 */
@TeleOp(name = "food", group = "food2")
public class GamePadd extends OpMode {
    Robot robot = new Robot();

    @Override
    public void init() {
        robot.init(hardwareMap);
    }


    @Override
    public void loop() {
        if (gamepad1.dpad_down == true) {
            robot.leftMotor.setPower(-1);
            robot.rightMotor.setPower(-1);
            robot.rightMotor2.setPower(-1);
            robot.leftMotor2.setPower(-1);

        } else if (gamepad1.dpad_up == true) {
            robot.leftMotor.setPower(1);
            robot.leftMotor2.setPower(1);
            robot.rightMotor.setPower(1);
            robot.rightMotor2.setPower(1);

        } else if (gamepad1.dpad_right == true) {
            robot.leftMotor.setPower(1);
            robot.leftMotor2.setPower(1);
            robot.rightMotor.setPower(-1);
            robot.rightMotor2.setPower(-1);
        } else if (gamepad1.dpad_left == true) {
            robot.leftMotor.setPower(-1);
            robot.leftMotor2.setPower(-1);
            robot.rightMotor.setPower(1);
            robot.rightMotor2.setPower(1);
        } else {
            robot.leftMotor.setPower(0);
            robot.leftMotor2.setPower(0);
            robot.rightMotor.setPower(0);
            robot.rightMotor2.setPower(0);
        }
    }
}

