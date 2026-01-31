package find;

import java.util.Arrays;
import java.util.List;

public class FindWithChar {

    public static void main(String[] args) {

        // converting arrays to arraylist
        List<String> names = Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Ram");

        // using limit to limit result
        names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
                .forEach(System.out::println);

    }

}
