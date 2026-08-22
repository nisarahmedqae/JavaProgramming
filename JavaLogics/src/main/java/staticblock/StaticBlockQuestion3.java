package staticblock;

public class StaticBlockQuestion3 {

    /*
     * Q5. Is it possible to compile and run a Java program without writing main() method?
     * Q6. Can we initialize member variables within static block?
     */

    String name;
    static int age;

    static {
        StaticBlockQuestion3 sbq = new StaticBlockQuestion3();
        sbq.name = "Naveen";
        age = 25;

        System.out.println("Static block executed for " + sbq.name + " : " + age);
    }

    public static void main(String[] args) {

    }

}
