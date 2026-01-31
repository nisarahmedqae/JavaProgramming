package filter;

import java.util.Arrays;

public class DistinctMethod {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        Arrays.stream(arr).distinct().forEach(System.out::print);

    }

}
