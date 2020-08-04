package dev.gerardo.exercises.designpatterns.command;

import dev.gerardo.exercises.designpatterns.command.vendor.garagedoor.GarageDoor;
import dev.gerardo.exercises.designpatterns.command.vendor.garagedoor.GarageDoorOpenCommand;
import dev.gerardo.exercises.designpatterns.command.vendor.light.Light;
import dev.gerardo.exercises.designpatterns.command.vendor.light.LightOnCommand;

public class CommandDemo {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
