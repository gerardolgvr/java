package dev.gerardo.exercises.designpatterns.command.vendor.garagedoor;

public class GarageDoor {

    public void up() {
        System.out.println("Garage door is open");
    }

    public void down() {
        System.out.println("Garage door down");
    }

    public void stop() {
        System.out.println("Garage door stop");
    }

    public void lightOn() {
        System.out.println("Garage door light on");
    }

    public void lightOff() {
        System.out.println("Garage door light off");
    }
}
