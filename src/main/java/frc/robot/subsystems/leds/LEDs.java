package frc.robot.subsystems.leds;

public class LEDs {

    private LEDsIO io = new LEDsIO();

    public void setPattern(String pattern) {
        io.setPattern(pattern);
    }

    public void setValue(int index) {
        io.setValue(index);
    }
}
