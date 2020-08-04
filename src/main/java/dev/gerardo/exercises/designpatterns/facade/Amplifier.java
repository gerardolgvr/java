package dev.gerardo.exercises.designpatterns.facade;

public class Amplifier {

    public void on() {
        System.out.println("Amplifier is on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Amplifier has setted the dvd");
    }

    public void setVolume(int i) {
        System.out.println("Volume at " + i);
    }

    public void off() {
        System.out.println("Amplifier is off");
    }
}
