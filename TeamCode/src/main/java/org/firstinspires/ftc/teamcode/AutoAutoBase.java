package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

@Autonomous(name="AutoAutoTest", group="Concept")
//@Disabled
public class AutoAutoTest {

    //create le motors and sensors
    public DcMotor leftFront = null;
    public DcMotor leftRear = null;
    public DcMotor rightFront = null;
    public DcMotor rightRear = null;
    public DistanceSensor sensorDistance;

    //create bridge from code to configuration
    HardwareMap hardwareMap =  null;

    //make the friggin class
    public AutoAutoTest() {

    }

    //initialize the bridge
    public void init(HardwareMap autoHardwareMap) {

        //idek what this does but do it
        hardwareMap = autoHardwareMap;

        //initializing distance sensor
        sensorDistance = hardwareMap.get(DistanceSensor.class, "distance");

        //match mapping of motors to config
        leftFront = hardwareMap.get(DcMotor.class, "FL");
        rightFront = hardwareMap.get(DcMotor.class, "FR");
        leftRear = hardwareMap.get(DcMotor.class, "RL");
        rightRear = hardwareMap.get(DcMotor.class, "RR");

        //make sure the wheels go in the same direction
        leftFront.setDirection(DcMotor.Direction.REVERSE);
        rightFront.setDirection(DcMotor.Direction.FORWARD);
        leftRear.setDirection(DcMotor.Direction.REVERSE);
        rightRear.setDirection(DcMotor.Direction.FORWARD);

        //BRAAAKEEEEE when not moving
        leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //dont move without me asking to
        leftFront.setPower(0.0);
        rightFront.setPower(0.0);
        leftRear.setPower(0.0);
        rightRear.setPower(0.0);

        //might wanna add encoder data here, i lowkey dont know what those are

    }


}
