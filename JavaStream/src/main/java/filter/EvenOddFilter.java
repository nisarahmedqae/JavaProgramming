package filter;

import java.util.Arrays;
import java.util.List;

public class EvenOddFilter {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("-----------------Even Numbers--------------");
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("-----------------Odd Numbers--------------");
        list.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

    }

}
