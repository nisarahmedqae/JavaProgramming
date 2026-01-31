package find;

import java.util.Arrays;
import java.util.List;

public class CheckIfNumAreGreaterThan {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        boolean status = numbers.stream().allMatch(n -> n > 5);
        System.out.println(status); // Output: true

    }

}
