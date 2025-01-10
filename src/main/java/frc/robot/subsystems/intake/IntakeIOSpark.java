package frc.robot.subsystems.intake;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class IntakeIOSpark extends IntakeIO {

    // Motor & Piston Creation
    private SparkMax intake = new SparkMax(getHardwareIDs(0), MotorType.kBrushless);
    private DoubleSolenoid piston = new DoubleSolenoid(PneumaticsModuleType.REVPH, 1, 2);
    private DoubleSolenoid piston2 = new DoubleSolenoid(PneumaticsModuleType.REVPH, 3, 4);

    @Override
    public void levelSwap(boolean up) {
        if (up) {
            piston.set(Value.kReverse);
            piston2.set(Value.kReverse);
        } else {
            piston.set(Value.kForward);
            piston2.set(Value.kForward);
        }
    }

    @Override
    public void runIntake(double speed) {
        intake.set(speed);
    }

    @Override
    public void timedIntake(double speed, double runtime) {
        Timer time = new Timer();
        intake.set(speed);

        if (time.get() >= runtime) intake.stopMotor();
    }
}
