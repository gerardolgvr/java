package dev.gerardo.exercises.designpatterns.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command");
    }
}
