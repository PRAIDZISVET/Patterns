package by.itacademy.pattern.command;

public class UpCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Повернуть вверх!");
    }

    @Override
    public void rollBack() {

    }
}
