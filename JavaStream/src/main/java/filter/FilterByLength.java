package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByLength {

    public static void main(String[] args) {

        List<String> languages = Arrays.asList("Java", "Python", "C#", "JS");

        List<String> longNames = languages.stream().filter(str -> str.length() > 4 && str.length() < 8).collect(Collectors.toList());
        System.out.println(longNames);
    }

}
