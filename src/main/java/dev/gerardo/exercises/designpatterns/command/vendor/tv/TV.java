package dev.gerardo.exercises.designpatterns.command.vendor.tv;

public class TV {

    public void on() {
        System.out.println("Tv is on");
    }

    public void off() {
        System.out.println("Tv is off");
    }

    public void setInputChannel(int channel) {
        System.out.println("Tv is on channel " + channel);
    }

    public void setVolume(int volume) {
        System.out.println("Tv is on volume " + volume);
    }
}
