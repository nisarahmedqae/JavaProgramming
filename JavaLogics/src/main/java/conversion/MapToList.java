package conversion;

import java.util.*;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "space");
        map.put(1, "nisar");
        map.put(3, "ahmed");

        List<Map.Entry<Integer, String>> mapList = new ArrayList<>(map.entrySet());
        System.out.println(mapList);

    }
}
