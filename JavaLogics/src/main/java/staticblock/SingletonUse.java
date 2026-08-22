package staticblock;

public class SingletonUse {

    public static void main(String[] args) {
        // usage
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); // true — same object every time

    }
}
