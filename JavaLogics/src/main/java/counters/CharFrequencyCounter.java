package counters;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharFrequencyCounter {

	/* map.merge(ele, 1, Integer::sum) → for each character,
	if it's not in the map yet, put it with value 1;
	if it already exists, add 1 to its current value using Integer::sum.
	 */
	public static void main(String[] args) {

		String input = "aabbcccdd";
		char[] charArr = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char ele : charArr) {
			map.merge(ele, 1, Integer::sum);
		}
		System.out.println(map); //{a=2, b=2, c=3, d=2}

		StringBuilder result = new StringBuilder();
		for (var entry : map.entrySet()) {
			result.append(entry.getKey()).append(entry.getValue());
		}
		System.out.println(result); //a2b2c3d2
	}

}