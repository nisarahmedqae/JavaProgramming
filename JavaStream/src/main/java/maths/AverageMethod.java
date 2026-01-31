package maths;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageMethod {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        OptionalDouble avg = Arrays.stream(arr).average();
        System.out.println(avg.getAsDouble());

    }

}
