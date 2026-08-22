package sorting;

import java.util.*;

public class SortMapKeysWithTreeMap {

    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 5);
        map.put("apple", 2);
        map.put("grape", 7);
        map.put("orange", 3);
        map.put("pineapple", 6);

        System.out.println("HashMap before sorting: " + map);

        // Sort using TreeMap in Descending Order
        Map<String, Integer> sortedByKeysDesc = new TreeMap<>(Comparator.reverseOrder());
        sortedByKeysDesc.putAll(map);

        System.out.println("Sorted by Keys (Descending): " + sortedByKeysDesc);

    }
}
