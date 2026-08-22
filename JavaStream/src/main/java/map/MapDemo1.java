package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        // uppercase
        List<String> list1 = vehicles.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(list1);

        // length
        List<Integer> list2 = vehicles.stream().map(name -> name.length()).collect(Collectors.toList());
        System.out.println(list2);
    }

}
