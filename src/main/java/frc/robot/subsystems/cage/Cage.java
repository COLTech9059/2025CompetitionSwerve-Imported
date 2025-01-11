package frc.robot.subsystems.cage;

public class Cage {

    // Create the io object to refer to CageIO
    private CageIO io = new CageIO();


    // Create the methods to reference the io file. There should be 4: one that runs using a speed parameter, one that runs for a specific amount of time, one that runs until the encoders read in a certain range, and one that stops the motion
    public void runSpeed(double speed) {
        io.runSpeed(speed);
    }

    public void runTime(double speed, double time) {
        io.runTime(speed, time);
    }

    public void runEncoder(double speed, double dist, double tolerance) {
        io.runEncoder(speed, dist, tolerance);
    }

    public void stop() {
        io.stop();
    }

}
