package conversion;

public class IntToString {

    public static void main(String[] args) {
        int num = 15628469;

        // Convert the number to a string
        String numString = Integer.toString(num);
        System.out.println("Converted String: " + numString);

        // Convert the number to a string with different method
        String numString2 = String.valueOf(num);
        System.out.println("Converted String: " + numString2);

    }
}