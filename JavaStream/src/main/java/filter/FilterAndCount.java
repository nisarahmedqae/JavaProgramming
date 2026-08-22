package filter;

import java.util.ArrayList;
import java.util.List;

public class FilterAndCount {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
        names.add("Ram");

        long count = names.stream().filter(s -> s.startsWith("A")).count(); // count data type is long
        System.out.println(count);

    }

}
