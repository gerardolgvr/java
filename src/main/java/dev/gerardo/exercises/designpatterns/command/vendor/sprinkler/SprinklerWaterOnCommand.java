package dev.gerardo.exercises.designpatterns.command.vendor.sprinkler;

import dev.gerardo.exercises.designpatterns.command.Command;

public class SprinklerWaterOnCommand implements Command {
    Sprinkler sprinkler;

    public SprinklerWaterOnCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.waterOn();
    }
}
