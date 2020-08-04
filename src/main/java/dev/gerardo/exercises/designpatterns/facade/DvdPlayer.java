package dev.gerardo.exercises.designpatterns.facade;

public class DvdPlayer {

    public void on() {
        System.out.println("DvdPlayer has turned on");
    }

    public void play(String movie) {
        System.out.println("Dvd player is playing " + movie);
    }

    public void stop() {
        System.out.println("DvdPlayer has stoped");
    }

    public void eject() {
        System.out.println("DvdPlayer has ejected");
    }

    public void off() {
        System.out.println("DvdPlayer has turned off");
    }
}
