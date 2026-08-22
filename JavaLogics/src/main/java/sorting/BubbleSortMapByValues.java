package sorting;

import java.util.*;

public class BubbleSortMapByValues {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 5);
        map.put("apple", 2);
        map.put("grape", 7);
        map.put("orange", 3);
        map.put("pineapple", 6);

        System.out.println("Map before sorting: " + map);

        // Convert the Map into an array
        Map.Entry<String, Integer>[] mapArr = map.entrySet().toArray(Map.Entry[]::new);

        // Perform bubble sort on the mapArr based on values
        for (int i = 0; i < mapArr.length; i++) {
            for (int j = i + 1; j < mapArr.length; j++) {
                if (mapArr[i].getValue() > mapArr[j].getValue()) {
                    var temp = mapArr[i];
                    mapArr[i] = mapArr[j];
                    mapArr[j] = temp;
                }
            }
        }

        // Create a new LinkedHashMap to store the sorted mapArr in order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Put the sorted mapArr into the LinkedHashMap
        for (var entry : mapArr) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("HashMap after sorting by values: " + linkedHashMap);
    }
}
