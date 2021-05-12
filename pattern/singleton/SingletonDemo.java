package by.itacademy.pattern.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.doSmth();
    }
}
