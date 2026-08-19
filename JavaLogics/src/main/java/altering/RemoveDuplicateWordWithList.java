package altering;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateWordWithList {

	public static void main(String[] args) {
		String name = "My name is Khan is my";
		String[] arr = name.toLowerCase().split(" ");
		List<String> result = new ArrayList<>();

		for (String word : arr) {
			if (!result.contains(word)) {  // exact match, not substring
				result.add(word);
			}
		}

		System.out.println(String.join(" ", result));
	}
}