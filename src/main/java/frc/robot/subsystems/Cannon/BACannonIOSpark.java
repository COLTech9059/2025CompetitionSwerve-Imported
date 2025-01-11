package frc.robot.subsystems.cannon;

import com.revrobotics.spark.SparkMax;
import frc.robot.Constants;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.Encoder;

public class BACannonIOSpark extends BACannonIO 
{
    // The baseMotor drives the rotation of the cannon
    private SparkMax baseMotor = new SparkMax(Constants.baseMotorID, MotorType.kBrushless);
    private RelativeEncoder baseEncoder = baseMotor.getEncoder();

    // Each row motor represents a row of compression wheels, with row1 being closest to the mouth of the cannon
    private SparkMax row1 = new SparkMax(Constants.row1ID, MotorType.kBrushless);
    private SparkMax row2 = new SparkMax(Constants.row2ID, MotorType.kBrushless);
    private SparkMax row3 = new SparkMax(Constants.row3ID, MotorType.kBrushless);
    private SparkMax[] motors = new SparkMax[] {row1, row2, row3};

    @Override
    public void setVoltage(int[] ids, double volts)
    {
        // Use a for loop and the setVoltage() method to assign the voltage setpoint to each of the indicated motors (you will also need the motors array defined above)
    }

    @Override
    public void setSpeed(int[] ids, double speed)
    {
        //Use a for loop and the set() method to assign the speed setpoint to each of the indicated motors
    }

    @Override
    public void stop(int[] ids)
    {
        // Use a for loop and the stop() method to stop each of the indicated motors
    }

    @Override 
    public void rotate(parameters go here)
    {
        // Apply the speed parameter to the baseMotor
    }

    @Override 
    public void rotateDistance(parameters go here)
    {
        /*
         * Apply the speed parameter to the baseMotor until the encoders read within the tolerances (dist +- tolerance is the range)
         * to read encoders, use baseEncoder.getPosition()
         */
    }

    @Override
    public void stopRotation()
    {   
        // Stop the baseMotor's rotation
    }
}

