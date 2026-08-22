package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListFunction {

    public static void main(String[] args) {
        // Sample list
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);

        // Sort list in ascending order
        list.sort(Comparator.naturalOrder());
        System.out.println("Ascending order:");
        System.out.println(list);

        // Sort list in descending order
        list.sort(Comparator.reverseOrder());
        System.out.println("Descending order:");
        System.out.println(list);

    }
}