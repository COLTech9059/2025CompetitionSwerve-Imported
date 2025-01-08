package frc.robot.subsystems.Cannon;

import com.revrobotics.spark.SparkMax;

import edu.wpi.first.math.util.Units;
import frc.robot.util.RBSISubsystem;

public class BACannon extends RBSISubsystem
{
    private BACannonIO io;

    public void runSpeed(int[] motors, double speed)
    {
        io.setSpeed(motors, speed);
    }

    public void runVoltage(int[] motors, double volts)
    {
        io.setVoltage(motors, volts);
    }

    public void stop(int[] motors)
    {
        io.stop(motors);
    }

    public void rotate(double speed)
    {
        io.rotate(speed);
    }

    public void stopRotation()
    {
        io.stopRotation();
    }

    public void rotateDistance(double speed, double dist, double tolerance)
    {
        io.rotateDistance(speed, dist, tolerance);
    }
}
