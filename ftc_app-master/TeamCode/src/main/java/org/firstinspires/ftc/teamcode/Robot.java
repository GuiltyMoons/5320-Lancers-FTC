package org.firstinspires.ftc.teamcode;

import android.drm.DrmStore;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cGyro;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.I2cAddr;
import com.qualcomm.robotcore.util.Range;

import java.security.PublicKey;


/**
 * Created by cao on 10/28/2016.
 */

public class Robot {

    DcMotor leftMotor;
    DcMotor leftMotor2;
    DcMotor rightMotor;
    DcMotor rightMotor2;

    public void init(HardwareMap hwMap) {

        leftMotor = hwMap.dcMotor.get("leftMotor");
        leftMotor2 = hwMap.dcMotor.get("leftMotor2");
        rightMotor = hwMap.dcMotor.get("rightMotor");
        rightMotor2 = hwMap.dcMotor.get("rightMotor2");

        leftMotor.setDirection(DcMotor.Direction.FORWARD);
        leftMotor2.setDirection(DcMotor.Direction.FORWARD);
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        rightMotor2.setDirection(DcMotor.Direction.REVERSE);

    }

    public void move(double frontLeftMotor, double backLeftMotor, double frontRightMotor, double backRighMotor) {
        leftMotor.setPower(frontLeftMotor);
        leftMotor2.setPower(backLeftMotor);
        rightMotor.setPower(frontRightMotor);
        rightMotor2.setPower(backRighMotor);
    }

    public void tankDrive(double left, double right){
        leftMotor.setPower(left);
        leftMotor2.setPower(left);
        rightMotor.setPower(right);
        rightMotor2.setPower(right);
    }

    public void moveAll(double Power) {
        leftMotor.setPower(Power);
        leftMotor2.setPower(Power);
        rightMotor.setPower(Power);
        rightMotor2.setPower(Power);
    }

    public void stop() {
        leftMotor.setPower(0);
        leftMotor2.setPower(0);
        rightMotor.setPower(0);
        rightMotor2.setPower(0);
    }

}