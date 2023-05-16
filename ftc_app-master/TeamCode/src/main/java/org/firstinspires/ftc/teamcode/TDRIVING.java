package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by cao on 5/12/2017.
 */
@TeleOp(name ="TDRIVINGS")
public class TDRIVING extends OpMode{
    Robot robot = new Robot();

    @Override
    public void init() {
        robot.init(hardwareMap);

    }

    @Override
    public void loop() {
        if (Math.abs(gamepad1.left_stick_y) > 0.1) {
            robot.leftMotor.setPower(0);
        } else {
            robot.leftMotor.setPower(gamepad1.left_stick_y);
        }

    }
}
