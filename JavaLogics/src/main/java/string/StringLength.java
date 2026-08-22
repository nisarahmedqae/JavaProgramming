package string;

public class StringLength {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// How to find length of string in java without using length method

		String str = "nahmed";

		System.out.println(str.length()); //length method
		
		System.out.println(str.lastIndexOf(""));

		int count = 0;
		for (char ch : str.toCharArray()) {
			count++;
		}
		System.out.println(count);
	}

}
