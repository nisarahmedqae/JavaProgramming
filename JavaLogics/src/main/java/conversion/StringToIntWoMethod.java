package conversion;

public class StringToIntWoMethod {
	// WAP: write a program
	// wap to convert string to integer without using Integer.parseInt() method

	public static void main(String[] args) {
		String str = "123";

		char[] ch = str.toCharArray();
		int result = 0;

		for (int i = 0; i < ch.length; i++) {
			int digit = ch[i] - '0'; // ASCII value of the character '0'/zero i.e 48
			result = result * 10 + digit;
		}

		System.out.println(result + 10);
	}

}