package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.LightSensor;

import java.util.Date;

/**
 * Created by Klaas on 18-9-15.
 */
public class VisOpmode extends OpMode {

    private LightSensor l1;
    private DcMotor mot1;


    @Override
    public void init() {
        // Do something
        l1 = hardwareMap.lightSensor.get("light1");
        mot1 = hardwareMap.dcMotor.get("motor1");
    }

    @Override
    public void loop() {
        telemetry.addData("Test", l1.getLightDetected());
        mot1.setDirection(DcMotor.Direction.FORWARD);
        mot1.setPower(0.5);
    }
}
