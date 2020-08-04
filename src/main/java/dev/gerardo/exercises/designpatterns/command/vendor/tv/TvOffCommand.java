package dev.gerardo.exercises.designpatterns.command.vendor.tv;

import dev.gerardo.exercises.designpatterns.command.Command;

public class TvOffCommand implements Command {
    TV tv;

    public TvOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
