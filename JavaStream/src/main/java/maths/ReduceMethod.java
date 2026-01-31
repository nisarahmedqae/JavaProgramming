package maths;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {

    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("------------reduce: sum-----------------");
        Optional<Integer> sum = numbersList.stream().reduce((a, b) -> a + b);
        System.out.println(sum.get());

        System.out.println("------------reduce: multiply-----------------");
        Optional<Integer> multiplication = numbersList.stream().reduce((a, b) -> a * b);
        System.out.println(multiplication.get());
    }

}
