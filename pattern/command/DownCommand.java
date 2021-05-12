package by.itacademy.pattern.command;

public class DownCommand implements  Command{
    @Override
    public void execute() {
        System.out.println("Повернуть вниз!");
    }

    @Override
    public void rollBack() {

    }
}
