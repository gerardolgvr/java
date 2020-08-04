package dev.gerardo.exercises.designpatterns.command.vendor.thermostat;

import dev.gerardo.exercises.designpatterns.command.Command;

public class ThermostatOffCommand implements Command {
    Thermostat thermostat;

    public ThermostatOffCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.off();
    }
}
