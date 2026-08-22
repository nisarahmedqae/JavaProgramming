package find;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MatchMethod {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>(Arrays.asList("Apple", "Mango", "Banana", "Guava"));

		System.out.println("----------------anyMatch-----------------");
		boolean result = fruits.stream().anyMatch(n -> n.startsWith("App"));
		System.out.println(result); // true: should match any one

		System.out.println("----------------allMatch-----------------");
		boolean result2 = fruits.stream().allMatch(n -> n.startsWith("App"));
		System.out.println(result2); // false: should match all

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		boolean status = numbers.stream().allMatch(n -> n > 5);
		System.out.println(status); // Output: true

		System.out.println("----------------noneMatch-----------------");
		boolean result3 = fruits.stream().noneMatch(n -> n.startsWith("App"));
		System.out.println(result3); // false: should not match any
		
	}

}
