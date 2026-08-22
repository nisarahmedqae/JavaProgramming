package sorting;

import java.util.*;

public class SortMapValuesUsingCollections {

    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "middle");
        map.put(1, "nisar");
        map.put(3, "ahmed");

        // Convert Map to List
        List<Map.Entry<Integer, String>> mapList = new ArrayList<>(map.entrySet());
        System.out.println(mapList); //[1=nisar, 2=middle, 3=ahmed]

        // Sort by values in Descending Order
        mapList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println(mapList); //[1=nisar, 2=middle, 3=ahmed]

        // Store sorted List into LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (var ele : mapList) {
            linkedHashMap.put(ele.getKey(), ele.getValue());
        }
        System.out.println(linkedHashMap); //{1=nisar, 2=middle, 3=ahmed}
    }
}
