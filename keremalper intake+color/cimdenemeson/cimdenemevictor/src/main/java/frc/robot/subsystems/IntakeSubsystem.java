package frc.robot.subsystems;

import frc.robot.commands.IntakeSetCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.*;


public class IntakeSubsystem extends SubsystemBase {
    
    private VictorSPX rightMotor;
    private VictorSPX leftMotor;

    
    public IntakeSubsystem(){
    rightMotor = new VictorSPX(3);
    leftMotor = new VictorSPX(4);

    rightMotor.setSelectedSensorPosition(0);
    leftMotor.setSelectedSensorPosition(0);
    }

    public void setIntake(Boolean open){
        if (open == true){
            rightMotor.setInverted(false);
            leftMotor.setInverted(false);
            rightMotor.set(ControlMode.PercentOutput, 0.5);
            leftMotor.set(ControlMode.PercentOutput, 0.5);
        }
        else{
            rightMotor.set(ControlMode.PercentOutput, 0);
            leftMotor.set(ControlMode.PercentOutput, 0);
        }
    }
    public void setIntakeReversed(){
        rightMotor.setInverted(true);
        leftMotor.setInverted(true);
        rightMotor.set(ControlMode.PercentOutput, 0.5);
        leftMotor.set(ControlMode.PercentOutput, 0.5);

    }
    public void intakeToShooter(){
        rightMotor.setInverted(false);
        leftMotor.setInverted(false);
        rightMotor.set(ControlMode.PercentOutput, 0.5);
        leftMotor.set(ControlMode.PercentOutput, 0.5);
    }
}