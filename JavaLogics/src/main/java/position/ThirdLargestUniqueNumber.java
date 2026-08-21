package position;

import java.util.*;

public class ThirdLargestUniqueNumber {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 3, 4, 8};
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int ele : arr) {
            // Increment count if the element exists, else initialize with 1
            map.merge(ele, 1, Integer::sum);
        }
        System.out.println(map); // {2=1, 3=2, 4=2, 7=1, 8=1}

        for (int ele : map.keySet()) {
            if (map.get(ele) == 1) {
                list.add(ele);
            }
        }

        System.out.println(list); // [2, 7, 8]
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list); // [8, 7, 2]
        System.out.println(list.get(2)); // Third Highest Number(2) according to Index
    }

}
