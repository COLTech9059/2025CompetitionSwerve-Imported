package frc.robot.subsystems.cannon;

import frc.robot.util.RBSISubsystem;

public class BACannon extends RBSISubsystem
{
    private BACannonIO io;

    public boolean runSpeed(int[] motors, double speed)
    {
        io.setSpeed(motors, speed);
        return true;
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

    public void rotateDistance(double speed, double dist, double tolerance)
    {
        io.rotateDistance(speed, dist, tolerance);
    }

    public void stopRotation()
    {
        io.stopRotation();
    }
}
