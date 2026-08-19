package altering;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordWithSet {

	public static void main(String[] args) {
		String name = "My name is Khan is my";
		String[] arr = name.toLowerCase().split(" ");
		Set<String> seen = new LinkedHashSet<>();

		for (String word : arr) {
			seen.add(word); // duplicates silently ignored
		}

		String result = String.join(" ", seen);
		System.out.println(result); // my name is khan
	}
}