package find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxMethod {

    public static void main(String[] args) {
        // Max number from list
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max.get()); // Output: 40

        // Min number from array
        int[] arr = {10, 20, 30, 40};
        Optional<Integer> min = Arrays.stream(arr).boxed().min(Integer::compareTo);
        System.out.println(min.get()); // Output: 10
    }

}
