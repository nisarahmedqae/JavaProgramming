package sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapKeysWithStream {

    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 5);
        map.put("apple", 2);
        map.put("grape", 7);
        map.put("orange", 3);
        map.put("pineapple", 6);

        System.out.println("HashMap before sorting: " + map);

        // Sort by keys in Descending Order
        LinkedHashMap<String, Integer> sortedByKeysDesc = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("Sorted by Keys (Descending): " + sortedByKeysDesc);

    }
}
