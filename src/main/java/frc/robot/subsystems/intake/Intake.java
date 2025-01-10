package frc.robot.subsystems.intake;

import frc.robot.util.RBSISubsystem;

public class Intake extends RBSISubsystem{

    private IntakeIO io;
    
    public Intake(int intakeID, int pistonFwd, int pistonRev, int piston2Fwd, int piston2Rev) {
        IntakeIO io = new IntakeIO(intakeID, pistonFwd, pistonRev, piston2Fwd, piston2Rev);
        this.io = io;
    }

    public void moveIntake(boolean up) {
        io.levelSwap(up);
    }

    public void runIntake(double speed) {
        io.runIntake(speed);
    }

    public void timedIntake(double speed, double runtime) {
        io.timedIntake(speed, runtime);
    }
}
