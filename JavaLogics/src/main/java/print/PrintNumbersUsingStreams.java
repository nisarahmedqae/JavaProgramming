package print;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintNumbersUsingStreams {

    /*
     * Print from 1 to 100 without using loop and recursion
     */
    public static void main(String[] args) {
        int[] numbersArr = IntStream.rangeClosed(1, 100).toArray();
        System.out.println(Arrays.toString(numbersArr));

        List<Integer> numbersList = IntStream.rangeClosed(1, 100)
                .boxed() // converts each int to Integer, since List needs objects not primitives
                .collect(Collectors.toList());

        System.out.println(numbersList);
    }

}
