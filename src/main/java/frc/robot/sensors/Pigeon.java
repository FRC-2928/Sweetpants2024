package frc.robot.sensors;

// import com.ctre.phoenix6.hardware.Pigeon2;
import com.ctre.phoenix.sensors.PigeonIMU;

//import frc.robot.Constants;
import frc.robot.Constants.CANBusIDs;

/**
 * Utility class responsible for the gyro
 */
public class Pigeon{
    private PigeonIMU m_pigeon;

    public Pigeon(){
        m_pigeon = new PigeonIMU(CANBusIDs.kPigeonIMU);
    }

    public double getYaw(){
        double ypr[] = {0, 0, 0};
        m_pigeon.getYawPitchRoll(ypr);
        return ypr[0];
    }

    public void resetGyro(){
        m_pigeon.setYaw(0);
    }
}
