package dev.gerardo.exercises.designpatterns.command.vendor.stereo;

import dev.gerardo.exercises.designpatterns.command.Command;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
