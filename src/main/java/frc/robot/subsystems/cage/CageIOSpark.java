package frc.robot.subsystems.cage;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import frc.robot.Constants;

public class CageIOSpark extends CageIO {

    // Create the motor controller object
    private SparkMax cageMotor = new SparkMax(Constants.baseMotorID, MotorType.kBrushless);
    private RelativeEncoder cageEncoder = cageMotor.getEncoder();

    // Create the method Overrides to actually interact with the hardware

    @Override
    public void runSpeed(double speed) {

    }

    @Override
    public void runTime(double speed, double time) {

    }

    @Override
    public void runEncoder(double speed,double dist, double tolerance) {

    }

    @Override
    public void stop() {

    }
}
