package otherConcepts;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Autoboxing and Unboxing
        Integer integerObject = 42;  // Autoboxing
        int primitiveInt = integerObject;  // Unboxing

        // Value methods
        int primitiveInt2 = 25;
        Integer integerObject2 = primitiveInt2;

        // Comparison methods
        Integer integer1 = 100;
        Integer integer2 = 200;
        int comparison = integer1.compareTo(integer2);
        boolean isEqual = integer1.equals(integer2);

        // Output
        System.out.println("Comparison result: " + comparison); //-1
        System.out.println("Equality result: " + isEqual); //false
    }
}
