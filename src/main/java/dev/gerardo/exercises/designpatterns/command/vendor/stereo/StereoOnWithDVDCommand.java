package dev.gerardo.exercises.designpatterns.command.vendor.stereo;

import dev.gerardo.exercises.designpatterns.command.Command;

public class StereoOnWithDVDCommand implements Command {
    Stereo stereo;

    public StereoOnWithDVDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setDvd();
        stereo.setVolume(11);
    }
}
