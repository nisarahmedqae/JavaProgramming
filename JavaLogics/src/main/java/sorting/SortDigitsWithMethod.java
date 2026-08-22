package sorting;

import java.util.Arrays;

public class SortDigitsWithMethod {

    public static void main(String[] args) {
        int num = 15628469;

        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);

        // Reconstruct the sorted number from the sorted array of digits
        String sortedNumString = new String(digits);
        long sortedNum = Long.parseLong(sortedNumString);

        System.out.println("Original number: " + num);
        System.out.println("Sorted number: " + sortedNum);

    }

}
