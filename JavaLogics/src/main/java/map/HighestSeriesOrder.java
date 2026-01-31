package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestSeriesOrder {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 15, 4, 6, 7, 8, 9, 10, 12, 99};

        Map<Integer, List<Integer>> map = new HashMap<>();
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            map.putIfAbsent(count, new ArrayList<>());
            if (arr[i] + 1 == arr[i + 1]) {
                map.get(count).add(arr[i]);
            } else {
                map.get(count).add(arr[i]);
                count++;
            }
        }

        System.out.println(map);

        int key = 0;
        for (int ele : map.keySet()) {
            int len = map.get(ele).size();
            if (len > key) {
                key = ele;
            }
        }

        System.out.println(map.get(key));
    }
}
