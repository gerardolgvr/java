package dev.gerardo.exercises.designpatterns.command.vendor.light;

import dev.gerardo.exercises.designpatterns.command.Command;
import dev.gerardo.exercises.designpatterns.command.vendor.light.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
