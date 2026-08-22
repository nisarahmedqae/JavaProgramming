package staticblock;

public class Singleton {

    //Q4. How can we create objects if we make the constructor private?

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}