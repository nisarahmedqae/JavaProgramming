package print;

public class PrintHelloWorld {

    public static void main(String[] args) {
        /*
         * Print Hello World without using semi colon(;)
         */

        // 1
        if (System.out.printf("Hello World") == null) {

        }

        System.out.println("\n");

        // 2
        if (System.out.append("Hello World") != null) {

        }

        System.out.println("\n");

        // 3
        if (System.out.append("Hello World").equals(null)) {

        }
    }

}
