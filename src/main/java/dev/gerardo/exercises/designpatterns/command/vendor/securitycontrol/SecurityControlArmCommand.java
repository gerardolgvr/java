package dev.gerardo.exercises.designpatterns.command.vendor.securitycontrol;

import dev.gerardo.exercises.designpatterns.command.Command;

public class SecurityControlArmCommand implements Command {
    SecurityControl securityControl;

    public SecurityControlArmCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.arm();
    }
}
