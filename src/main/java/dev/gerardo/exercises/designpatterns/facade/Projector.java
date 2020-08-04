package dev.gerardo.exercises.designpatterns.facade;

public class Projector {

    public void on() {
        System.out.println("Projector has turned on");
    }

    public void wideScreenMode() {
        System.out.println("Projector is on WideScreenMode");
    }

    public void off() {
        System.out.println("Projector has turned off");
    }
}
