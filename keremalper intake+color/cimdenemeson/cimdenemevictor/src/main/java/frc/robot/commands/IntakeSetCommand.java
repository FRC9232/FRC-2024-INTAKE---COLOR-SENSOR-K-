package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ColorSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
public class IntakeSetCommand extends Command{
    
    private final IntakeSubsystem intakeSubsystem;
    private final ColorSubsystem colorSubsystem;
    private  boolean open;
    private  boolean isReversed;
 public IntakeSetCommand(IntakeSubsystem intakeSubsystem,ColorSubsystem colorSubsystem, Boolean open, Boolean isReversed){
        this.intakeSubsystem = intakeSubsystem;
        this.colorSubsystem = colorSubsystem;
        this.open= open;
        this.isReversed= isReversed;
        addRequirements(intakeSubsystem, colorSubsystem);
    }
    public void execute(){
        if (isReversed){
            intakeSubsystem.setIntakeReversed();
        }
        else{
            if(colorSubsystem.hasIntakeTaken() == false){
                open = false;
            }
            intakeSubsystem.setIntake(open);
        }
        
        
    }
    public void end(){
        intakeSubsystem.setIntake(false);
    }
}
