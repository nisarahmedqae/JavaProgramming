package genericDataType;

//2. Code Reusability
public class GenericClassExample {

    public static void main(String[] args) {
        GenericClass<String> stringBox = new GenericClass<>();
        stringBox.setItem("Hello");
        System.out.println(stringBox.getItem());

        GenericClass<Integer> intBox = new GenericClass<>();
        intBox.setItem(123);
        System.out.println(intBox.getItem());
    }
}