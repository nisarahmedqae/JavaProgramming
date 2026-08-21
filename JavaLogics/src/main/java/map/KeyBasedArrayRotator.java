package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyBasedArrayRotator {

    public static void main(String[] args) {
        //Input = {1,2,3,4,5,6,7,8}, midKey = 4,  Output = {5,6,7,8,1,2,3,4}

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int midKey = arr.length / 2;

        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(midKey, new ArrayList<>());

        for (int ele : arr) {
            if (ele > midKey) {
                map.get(midKey).add(ele);
            }
        }
        System.out.println(map); // {4=[5, 6, 7, 8]}

        for (int ele : arr) {
            if (ele <= midKey) {
                map.get(midKey).add(ele);
            }
        }
        System.out.println(map); // {4=[5, 6, 7, 8, 1, 2, 3, 4]}

        System.out.println(map.get(midKey)); // [5, 6, 7, 8, 1, 2, 3, 4]
    }
}
