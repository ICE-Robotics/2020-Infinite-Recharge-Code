package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class TrenchRunAuto extends SequentialCommandGroup {

    public TrenchRunAuto() {
        addCommands(
                new TurretFire().withTimeout(5),
                new ParallelCommandGroup(
                        new SetIntakePower(1),
                        new SequentialCommandGroup(
                                new DriveToPoint(0, -216),
                                new DriveToPoint(0, -216),
                                new TurretFire().withTimeout(5)
                        )
                ));
    }
}
