package stringConstantPool;

public class StringPoolExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2.intern(); // str3 now points to the interned string in the pool

        // str1 and str2 do not point to the same object
        System.out.println(str1 == str2); // Output: false

        // Using intern() to get a reference from the pool
        System.out.println(str1 == str3); // Output: true
    }
}