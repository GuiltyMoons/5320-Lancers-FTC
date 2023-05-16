package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by cao on 5/13/2017.
 */
@TeleOp(name = "ha3", group = "NewJuan7")
public class newDriving extends OpMode {
    Robot2 robot2 = new Robot2();
    Intake intake = new Intake();
    Arm arm = new Arm();
    FlyWheel flyWheel = new FlyWheel();


    @Override
    public void init() {
        robot2.init(hardwareMap);
        arm.init(hardwareMap);
        flyWheel.init(hardwareMap);
        intake.init(hardwareMap);

    }

    @Override
    public void loop() {
        if (Math.abs(gamepad1.left_stick_y) < 0.1) {
            robot2.leftMotor.setPower(0);
            robot2.leftMotor2.setPower(0);
        } else {
            robot2.leftMotor.setPower(gamepad1.left_stick_y);
            robot2.leftMotor2.setPower(gamepad1.left_stick_y);
        }
        if (Math.abs(gamepad1.right_stick_y) < 0.1) {
            robot2.rightMotor.setPower(0);
            robot2.rightMotor2.setPower(0);
        }else{
            robot2.rightMotor.setPower(gamepad1.right_stick_y);
            robot2.rightMotor2.setPower(gamepad1.right_stick_y);
        }

        if (gamepad2.a) {
            flyWheel.flyWheelRight.setPower(-1);
            flyWheel.flyWheelLeft.setPower(-1);
        }else {
            flyWheel.flyWheelLeft.setPower(0);
            flyWheel.flyWheelRight.setPower(0);
        }

        if (gamepad2.dpad_up) {
            intake.intakeMotor.setPower(1);
        }else if (gamepad2.dpad_down){
            intake.intakeMotor.setPower(-1);
        }else{
            intake.intakeMotor.setPower(0);
        }

        if (gamepad2.right_bumper) {
            arm.clickerUpper.setPosition(1);
            arm.clickerBottom.setPosition(1);
        }else {
            arm.clickerUpper.setPosition(0);
            arm.clickerBottom.setPosition(0);
        }
    }
}
