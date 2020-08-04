package dev.gerardo.exercises.designpatterns.command.vendor.garagedoor;

import dev.gerardo.exercises.designpatterns.command.Command;
import dev.gerardo.exercises.designpatterns.command.vendor.garagedoor.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
