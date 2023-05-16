package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by cao on 5/13/2017.
 */
@TeleOp(name = "HA3")
public class newCombined extends OpMode {
    NewRobot robot = new NewRobot();
    newDriving newdriving = new newDriving();
    NewRobot newRobot = new NewRobot();
    boolean shooting = false;
    boolean beacon = false;

    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            shooting = true;
        }else if (gamepad1.b)  {
            beacon = true;
        }else{
            shooting = false;
            beacon = false;
        }
        while (shooting = true) {
            newdriving.init_loop();
        }
        while(beacon) {
            newRobot.init_loop();
        }
    }
}
