// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveCcwCircle extends CommandBase {
  //makes robot drive in a circle counterclockwise

  private final DriveTrain drivetrain;

  /** Creates a new DriveCwCircle. */
  public DriveCcwCircle(DriveTrain drivetrain) {
    this.drivetrain = drivetrain;

    addRequirements(drivetrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    @Override
    public void initialize() {
      double targetDegrees = 359;
        while(drivetrain.getAngle() < targetDegrees){
          drivetrain.drive(0.3,0.7);
        }
    }
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
