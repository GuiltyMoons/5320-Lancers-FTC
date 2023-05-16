package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by cao on 12/9/2016.
 */
/*
@TeleOp(name = "T")
public class WithoutFly extends OpMode {
    Robot robot = new Robot();
    Intake intake = new Intake();
    Arm arm = new Arm();
    ColorSensor color;

    @Override
    public void init() {
        robot.init(hardwareMap);
        intake.init(hardwareMap);
        arm.init(hardwareMap);
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
            intake.intakeMotor.setPower(-1);
        } else if (gamepad2.dpad_down){
            intake.intakeMotor.setPower(1);
        }else{
            intake.intakeMotor.setPower(0);
        }
        if (gamepad2.b) {
            arm.clicker.setPosition(0.6);
        }else{
            arm.clicker.setPosition(0);
        }
    }
*/