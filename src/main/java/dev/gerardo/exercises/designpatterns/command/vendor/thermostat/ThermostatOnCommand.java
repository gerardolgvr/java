package dev.gerardo.exercises.designpatterns.command.vendor.thermostat;

import dev.gerardo.exercises.designpatterns.command.Command;

public class ThermostatOnCommand implements Command {
    Thermostat thermostat;

    public ThermostatOnCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.on();
    }
}
