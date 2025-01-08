package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.Cannon.BACannon;

public class CannonCommands 
{

    public static void shootCommand(BACannon cannon, double delay, double speed) {
        Commands.run(
            () -> {
                Timer time = new Timer();
                cannon.runSpeed(new int[] {1, 2}, speed);
                if (time.get() > delay) cannon.runSpeed(new int[] {1, 2, 3}, speed);
                if (time.get() > delay + 1) cannon.stop(new int[] {1, 2, 3});
            }, 
            cannon);
    }

    public static void moveCannon(BACannon cannon, double speed, double dist) {
        Commands.run(
            () -> {
                // Write a command body to rotate the cannon to the setpoint using the speed and dist parameters
            },
        cannon);
    }
}
