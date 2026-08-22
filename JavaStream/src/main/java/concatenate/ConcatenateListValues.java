package concatenate;

import java.util.Arrays;
import java.util.List;

public class ConcatenateListValues {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "is", "awesome");
		String sentence = String.join(" ", words);
		System.out.println(sentence); // Output: Java is awesome

	}

}
