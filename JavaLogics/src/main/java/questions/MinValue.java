package questions;

public class MinValue {

    /*
     * what is the value of double MIN_VALUE?
     * Which one is bigger -> Double MIN_VALUE or 0.0d?
     * Which one is bigger -> Double MIN_VALUE or NEGATIVE_INFINITY?
     */
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MIN_VALUE); // is a +ve number
        System.out.println(Double.MIN_VALUE); // is a +ve number

        System.out.println("-------------------------------");

        System.out.println(Math.min(Integer.MIN_VALUE, 0));
        System.out.println(Math.min(Float.MIN_VALUE, 0.0f)); // 0.0
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); // 0.0
    }

}
