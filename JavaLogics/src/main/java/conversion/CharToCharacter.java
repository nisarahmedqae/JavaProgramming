package conversion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharToCharacter {

    //.chars() → returns an IntStream of the Unicode code points of each character (not char values directly)
    public static void main(String[] args) {
        // List of Character
        long num = 121343;
        List<Character> list = String.valueOf(num).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println(list);

        // Array of Character
        String str = "java";
        Character[] chrArray = str.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        System.out.println(Arrays.toString(chrArray));

        /*
        If you call the no-argument .toArray(), Java always gives you back an Object[],
        even though every element inside is actually a Character.
        This happens because of type erasure — at runtime,
        the stream doesn't retain full knowledge of Character as the element type,
        so it defaults to the safest common type, Object.
         */

    }
}