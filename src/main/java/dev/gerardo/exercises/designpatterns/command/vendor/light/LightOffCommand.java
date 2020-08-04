package dev.gerardo.exercises.designpatterns.command.vendor.light;

import dev.gerardo.exercises.designpatterns.command.Command;
import dev.gerardo.exercises.designpatterns.command.vendor.light.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
