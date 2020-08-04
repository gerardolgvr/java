package dev.gerardo.exercises.designpatterns.command.vendor.stereo;

public class Stereo {

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("Stereo mode cd");
    }

    public void setDvd() {
        System.out.println("Stereo mode dvd");
    }

    public void setRadio() {
        System.out.println("Stereo mode radio");

    }

    public void setVolume(int level) {
        System.out.println("Stereo setting volume to " + level);
    }
}
