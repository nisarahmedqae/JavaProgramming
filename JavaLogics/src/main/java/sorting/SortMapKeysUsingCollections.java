package sorting;

import java.util.*;

public class SortMapKeysUsingCollections {

    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "middle");
        map.put(1, "nisar");
        map.put(3, "ahmed");

        // Convert Map to List
        List<Map.Entry<Integer, String>> mapList = new ArrayList<>(map.entrySet());
        System.out.println(mapList); //[1=nisar, 2=middle, 3=ahmed]

        // Sort by keys in Descending Order
        Collections.sort(mapList, Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println(mapList); //[3=ahmed, 2=middle, 1=nisar]

        // Store sorted List into LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (var ele : mapList) {
            linkedHashMap.put(ele.getKey(), ele.getValue());
        }
        System.out.println(linkedHashMap); //{3=ahmed, 2=middle, 1=nisar}
    }
}
