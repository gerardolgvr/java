package dev.gerardo.exercises.designpatterns.command.vendor.sprinkler;

import dev.gerardo.exercises.designpatterns.command.Command;

public class SprinklerWaterOffCommand implements Command {
    Sprinkler sprinkler;

    public SprinklerWaterOffCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.waterOff();
    }
}
