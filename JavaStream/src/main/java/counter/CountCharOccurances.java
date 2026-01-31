package counter;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharOccurances {

    public static void main(String[] args) {
        String input = "java";
        Map<Character, Long> frequency = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(frequency); // Output: {a=2, j=1, v=1}

        System.out.println("------------------ gap --------------------");

        long num = 121343;
        Map<Character, Long> numFrequency = String.valueOf(num).chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(numFrequency); // Output: {1=2, 2=1, 3=2, 4=1}
    }

}
