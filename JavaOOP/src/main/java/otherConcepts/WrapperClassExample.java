package otherConcepts;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Autoboxing and Unboxing
        Integer integerObject = 42;  // Autoboxing(boxed)
        int primitiveInt = integerObject;  // Unboxing

        // Comparison methods
        Integer integer1 = 100;
        Integer integer2 = 200;
        
        // Output
        System.out.println("Comparison result: " + integer1.compareTo(integer2)); //-1
        System.out.println("Equality result: " + integer1.equals(integer2)); //false
    }
}
