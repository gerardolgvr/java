package dev.gerardo.exercises.designpatterns.facade;

public class TheaterLights {

    public void dim(int i) {
        System.out.println("lights are at " + i);
    }

    public void on() {
        System.out.println("TheaterLights are on");
    }
}
