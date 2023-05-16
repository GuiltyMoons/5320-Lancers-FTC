package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

    @TeleOp(name = "HAEXP")
    public class experimental extends OpMode {
        juan juan = new juan();
        boolean a = false;
        TDRIVING driving = new TDRIVING();


        @Override
        public void init() {
            juan.init();
            driving.init();

        }

        @Override

        public void loop() {
            if (gamepad1.a) {
                a = true;
            } else if (gamepad1.b) {
                a = false;
            }
            while (a = true) {
                juan.init();
            }
            while (a = false) ;
            driving.init();
        }
    }
