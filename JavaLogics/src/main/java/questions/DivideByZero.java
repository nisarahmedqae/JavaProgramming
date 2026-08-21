package questions;

public class DivideByZero {

    /*
     * what will be the output when you divide a number by zero? Number = Integer,
     * double, float
     */
    public static void main(String[] args) {
        //System.out.println(9 / 0); // Arithmetic Exception
        //System.out.println(0 / 0); // Arithmetic Exception
        System.out.println(0.0 / 0); // NaN
        System.out.println(0.0 / 0.0); // NaN
        System.out.println(9.0 / 0); // Infinity
        System.out.println(12 / 0.0); // Infinity

    }

}
