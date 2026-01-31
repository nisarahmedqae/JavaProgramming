package find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinStr {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Ram");
        Optional<String> min = numbers.stream().min(String::compareTo);
        System.out.println(min.get()); // Output: Adam

    }

}
