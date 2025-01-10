package frc.robot.subsystems.intake;

public class IntakeIO {

    private int intakeID;
    private int pistonFwd;
    private int pistonRev;
    private int piston2Fwd;
    private int piston2Rev;
    private int[] IDs = new int[] {intakeID, pistonFwd, pistonRev, piston2Fwd, piston2Rev};

    public IntakeIO(int intakeID, int pistonFwd, int pistonRev, int piston2Fwd, int piston2Rev) {
        this.intakeID = intakeID;
        this.pistonFwd = pistonFwd;
        this.pistonRev = pistonRev;
        this.piston2Fwd = piston2Fwd;
        this.piston2Rev = piston2Rev;
    }

    public IntakeIO() {}

    public int getHardwareIDs(int num) {
        return IDs[num];
    }

    public void levelSwap(boolean up) {}

    public void runIntake(double speed) {}

    public void timedIntake(double speed, double runtime) {}
}
