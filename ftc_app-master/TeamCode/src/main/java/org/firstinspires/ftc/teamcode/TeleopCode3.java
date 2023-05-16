package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by cao on 12/7/2016.
 */
/**
@TeleOp(name = "dude3000", group = "dude 5000")
public class TeleopCode3 extends OpMode {
    Robot robot = new Robot();
    FlyWheel flywheel = new FlyWheel();
    Intake intake = new Intake();

    @Override
    public void init() {
        robot.init(hardwareMap);
        flywheel.init(hardwareMap);
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
            intake.intake.setPower(1);
        } else {
            intake.intake.setPower(0);
        }
        if (gamepad2.dpad_down) {
            intake.intake.setPower(-1);
        } else {
            intake.intake.setPower(0);
            if (gamepad2.a) {
                flywheel.flyWheelLeft.setPower(1);
                flywheel.flyWheelRight.setPower(1);
            } else {
                flywheel.flyWheelLeft.setPower(0);
                flywheel.flyWheelRight.setPower(0);
            }
        }
    }
}


*/