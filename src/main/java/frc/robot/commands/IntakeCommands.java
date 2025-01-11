package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.intake.Intake;

public class IntakeCommands {

    public static void timedIntake(Intake intake, double speed, double runtime) {
        Commands.run(
            () -> {
                intake.timedIntake(speed, runtime);
            },
        intake);
    }

    public static void activeIntake(Intake intake, double speed) {
        Commands.run(
            () -> {
                intake.runIntake(speed);
            },
        intake);
    }
}
