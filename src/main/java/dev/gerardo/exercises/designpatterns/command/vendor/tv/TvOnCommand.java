package dev.gerardo.exercises.designpatterns.command.vendor.tv;

import dev.gerardo.exercises.designpatterns.command.Command;

public class TvOnCommand implements Command {
    TV tv;

    public TvOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setInputChannel(21);
        tv.setVolume(22);
    }
}
