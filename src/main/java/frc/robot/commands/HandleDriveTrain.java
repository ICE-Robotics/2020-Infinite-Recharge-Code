package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class HandleDriveTrain extends CommandBase{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

    /**
     * Creates a new HandleDriveTrain Command.
     *
     */
    public HandleDriveTrain() {
        addRequirements(RobotContainer.drivetrain);
      }

        // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        RobotContainer.drivetrain.stop(); // Don't move on init
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        double power = RobotContainer.getLeftJoy().getY();
        double turn = RobotContainer.getRightJoy().getX();
        power = Math.copySign(Math.abs(Math.pow(power, 2)), power);
        SmartDashboard.putNumber("Power", power);
        SmartDashboard.putNumber("Turn", turn);

        RobotContainer.drivetrain.arcadeDrive(power, turn);
        super.execute();
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
