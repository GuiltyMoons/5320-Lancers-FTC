package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cColorSensor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by cao on 12/9/2016.
 */
/*
@TeleOp(name = "5555")
public class TeleopCode4 extends OpMode {
    Robot robot = new Robot();
    FlyWheel flywheel = new FlyWheel();
    Intake intake = new Intake();
    Arm arm = new Arm();


    @Override
    public void init() {
        robot.init(hardwareMap);
        flywheel.init(hardwareMap);
        intake.init(hardwareMap);
        arm.init(hardwareMap);
    }

    @Override
    public void loop() {

        if (Math.abs(gamepad1.right_stick_y) > 0.1) {
            robot.leftMotor.setPower(gamepad1.right_stick_y);
            robot.leftMotor2.setPower(gamepad1.right_stick_y);
        } else {
            robot.leftMotor.setPower(0);
            robot.leftMotor2.setPower(0);
        }
        if (Math.abs(gamepad1.left_stick_y) > 0.1) {
            robot.rightMotor.setPower(gamepad1.left_stick_y);
            robot.rightMotor2.setPower(gamepad1.left_stick_y);
        } else {
            robot.rightMotor.setPower(0);
            robot.rightMotor2.setPower(0);
        }
        if (Math.abs(gamepad2.left_stick_y) > 0.1) {
            intake.intakeMotor.setPower(gamepad2.left_stick_y);
        } else {
            intake.intakeMotor.setPower(0);
        }
        if (gamepad2.a) {
            flywheel.flyWheelLeft.setPower(1);
            flywheel.flyWheelRight.setPower(1);
        } else {
            flywheel.flyWheelLeft.setPower(0);
            flywheel.flyWheelRight.setPower(0);
        }
        if (gamepad2.right_bumper) {
            arm.clicker.setPosition(0.3);
        } else {
            arm.clicker.setPosition(0.9);
        }
        if (gamepad2.left_bumper) {
            arm.clicker2.setPosition(0.7);
        } else {
            arm.clicker2.setPosition(0);
        }
        */