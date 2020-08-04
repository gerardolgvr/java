package dev.gerardo.exercises.designpatterns.command.vendor.securitycontrol;

import dev.gerardo.exercises.designpatterns.command.Command;

public class SecurityControlDisarmCommand implements Command {
    SecurityControl securityControl;

    public SecurityControlDisarmCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.disarm();
    }
}
