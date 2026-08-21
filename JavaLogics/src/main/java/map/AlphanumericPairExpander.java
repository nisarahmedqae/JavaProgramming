package map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class AlphanumericPairExpander {

    public static void main(String[] args) {
        String str = "a1b2c3d0f4e6";
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length - 1; i++) {
            char key = arr[i];
            int value = arr[i + 1] - '0';
            i++;
            map.put(key, value);
        }
        System.out.println(map);

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                sb.append(entry.getKey());
            }
        }
        System.out.println(sb);
    }
}

