package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

    public static void main(String[] args) {
        // print names which has last letter as "a" with UPPERCASE
        List<String> mainList = Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Ram");
        List<String> list1 =  mainList.stream().filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list1);

        System.out.println("--------------------------");

        // print names which has last letter as "a" with UPPERCASE
        List<String> list2 =  mainList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list2);

    }

}
