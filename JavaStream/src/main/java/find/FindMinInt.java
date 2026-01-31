package find;

import java.util.Arrays;

public class FindMinInt {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int min = Arrays.stream(arr).boxed().min(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("No minimum value found"));
        System.out.println(min); // Output: 5

    }

}
