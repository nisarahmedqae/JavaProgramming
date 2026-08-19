package altering;

public class ReplaceCharsWithIncrement {

	public static void main(String[] args) {
		String input = "tomorrow";
		StringBuilder result = new StringBuilder();
		int count = 1;

		for (char ele : input.toCharArray()) {
			if (ele == 'o') {
				for (int i = 0; i < count; i++) {
					result.append('&');
				}
				count++;
			} else {
				result.append(ele);
			}
		}

		System.out.println(result);
	}
}