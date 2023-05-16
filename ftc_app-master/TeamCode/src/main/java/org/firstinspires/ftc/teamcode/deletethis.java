package org.firstinspires.ftc.teamcode;

import android.graphics.Path;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Hardware;

/**
 * Created by cao on 12/10/2016.
 */
@TeleOp(name = "dude5320", group = "dude 6676")
public class deletethis extends OpMode {
    Robot robot = new Robot();
    FlyWheel flyWheel = new FlyWheel();
    Intake intake = new Intake();

    @Override
    public void init() {
        robot.init(hardwareMap);
        flyWheel.init(hardwareMap);
        intake.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (Math.abs(gamepad1.left_stick_y) > 0.1) {
            robot.leftMotor.setPower(gamepad1.left_stick_y);
            robot.leftMotor2.setPower(gamepad1.left_stick_y);
        } else {
            robot.leftMotor.setPower(0);
            robot.leftMotor2.setPower(0);
        }
        if (Math.abs(gamepad1.right_stick_y) > 0.1) {
            robot.rightMotor.setPower(gamepad1.right_stick_y);
            robot.rightMotor2.setPower(gamepad1.right_stick_y);
        } else {
            robot.rightMotor.setPower(0);
            robot.rightMotor2.setPower(0);
        }
        if (gamepad2.dpad_up) {
            intake.intakeMotor.setPower(1);
        } else if (gamepad2.dpad_down) {
            intake.intakeMotor.setPower(-1);
        } else {
            intake.intakeMotor.setPower(0);
        }
        if (gamepad1.a) {
            flyWheel.flyWheelRight.setPower(1);
            flyWheel.flyWheelLeft.setPower(1);
        } else {
            flyWheel.flyWheelRight.setPower(0);
            flyWheel.flyWheelLeft.setPower(0);
        }
    }
}

