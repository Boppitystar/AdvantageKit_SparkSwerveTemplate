package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.subsystems.intake.Intake;
import frc.robot.subsystems.intake.Pivot;

/** Extends the pivot out to the ground and runs the intake roller forward. */
public class IntakeDeployCommand extends ParallelCommandGroup {

  public IntakeDeployCommand(Pivot pivot, Intake intake) {
    addCommands(pivot.runIntakePivotGroundCommand(), intake.runIntakeForwardCommand());
  }
}
