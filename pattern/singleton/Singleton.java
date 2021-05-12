package by.itacademy.pattern.singleton;

public final class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public void doSmth() {
        System.out.println("asdfasdf");
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                instance = new Singleton();
//            }
//
//        }
//        return instance;
//    }


}
