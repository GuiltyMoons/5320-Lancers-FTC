package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by cao on 11/5/2016.
 */

/**
public class TeleOpCode2 extends OpMode {
    Intake intake = new Intake();
    FlyWheel flyWheel = new FlyWheel();

    @Override
    public void init() {
        intake.init(hardwareMap);
        flyWheel.init(hardwareMap);

    }
    color = hardwareMap.colorSensor.get("color");
    while (time.seconds() < 20) {
    robot.move(1,1,1,1);
    robot.move(-0.3,-0.3,0.3,0.3);
    }
    }
    }



    if(color.green() == green){
    //Go to green color

    @Override
    public void loop() {
        if (Math.abs(gamepad2.left_stick_y) < 0.1) {
            intake.intakeStop();
        } else {
            intake.intakeIn(gamepad2.left_stick_y);
        }
        if (gamepad2.a) {
            flyWheel.flyWheelLeft.setPower(1);
            flyWheel.flyWheelRight.setPower(1);

        } else {
            flyWheel.flyWheelLeft.setPower(0);
            flyWheel.flyWheelRight.setPower(0);














    }
    if (Math.abs(gamepad2.left_stick_y) < 0.1) {
    intake.intakeIn(1);
    } else {
    intake.intakeStop();
    }
    if (gamepad2.a) {
    flyWheel.flyWheelLeft.setPower(1);
    flyWheel.flyWheelRight.setPower(1);
    } else {
    flyWheel.flyWheelLeft.setPower(0);
    flyWheel.flyWheelRight.setPower(0);
    }
    }
    }


    }
    }
}

 */