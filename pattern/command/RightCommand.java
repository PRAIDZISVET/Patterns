package by.itacademy.pattern.command;

public class RightCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Повернуть направо!");
    }

    @Override
    public void rollBack() {

    }
}
