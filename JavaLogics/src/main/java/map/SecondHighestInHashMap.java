package map;

import java.util.*;

public class SecondHighestInHashMap {

	public static void main(String[] args) {
		/// Sample HashMap with integer values
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 30);
		map.put("B", 10);
		map.put("C", 70);
		map.put("D", 50);
		map.put("E", 40);

		// Convert the values to a list
		List<Integer> valuesList = new ArrayList<>(map.values());
		Collections.sort(valuesList, Comparator.reverseOrder());

		System.out.println(valuesList); //[70, 50, 40, 30, 10]
		System.out.println(valuesList.get(1)); //50

	}

}
