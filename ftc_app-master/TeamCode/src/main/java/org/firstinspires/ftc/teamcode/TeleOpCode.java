package org.firstinspires.ftc.teamcode;



import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by cao on 10/26/2016.
 */
/**
@TeleOp(name = "dude", group = "dude5")
public class TeleOpCode extends OpMode {
    Robot robot = new Robot();

    @Override
    public void init() {

        robot.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (Math.abs(gamepad1.left_stick_y) < 0.1) {
            robot.leftMotor.setPower(0);
            robot.leftMotor2.setPower(0);

        } else {

            robot.leftMotor.setPower(gamepad1.left_stick_y);
            robot.leftMotor2.setPower(gamepad1.left_stick_y);
        }

        if (Math.abs(gamepad1.right_stick_y) < 0.1) {
            robot.rightMotor.setPower(0);
            robot.rightMotor2.setPower(0);

        } else {
            robot.rightMotor.setPower(gamepad1.right_stick_y);
            robot.rightMotor2.setPower(gamepad1.right_stick_y);
        }
    }
}
*/