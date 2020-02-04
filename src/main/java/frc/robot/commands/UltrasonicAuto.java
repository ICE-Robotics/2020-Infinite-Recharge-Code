/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class UltrasonicAuto extends CommandBase {

  private static final double kHoldDistance = 12.0;
  //factor to convert sensor values to a distance in inches
  private static final double kValueToInches = 0.125;

  private static final int kUltrasonicPort = 0;

  private AnalogInput Ultrasonic;

  //private final 
  /**
   * Creates a new UltrasonicAuto.
   */
  public UltrasonicAuto() {
    Ultrasonic = RobotContainer.ultrasonic;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      double currentDistance = m_ultrasonic.getValue() * kValueToInches;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
