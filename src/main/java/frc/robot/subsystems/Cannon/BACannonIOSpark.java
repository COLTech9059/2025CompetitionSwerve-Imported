package frc.robot.subsystems.Cannon;

import com.revrobotics.spark.SparkMax;
import frc.robot.Constants;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.Encoder;

public class BACannonIOSpark extends BACannonIO 
{

    private SparkMax baseMotor = new SparkMax(Constants.baseMotorID, MotorType.kBrushless);
    private RelativeEncoder baseEncoder = baseMotor.getEncoder();

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
    public void rotate(/*Create a parameter to represent the input speed (you may cross reference with other files)*/)
    {
        // Apply the speed parameter to the baseMotor
    }

    @Override
    public void stopRotation()
    {   
        // Stop the baseMotor's rotation
    }

    @Override
    public void rotateDistance(/*Create parameters for speed, encoder position, and tolerance*/)
    {
        /*
         * Apply the speed parameter to the baseMotor until the encoders read within the tolerances
         * to read encoders, use baseEncoder.getPosition()
         */
    }
}







































































































/*
 *  for(int i = 0; i < ids.length; i++)
    {
        motors[ids[i]].set(speed);
    }
 */