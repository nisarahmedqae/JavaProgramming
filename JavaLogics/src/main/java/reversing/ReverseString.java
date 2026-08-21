package reversing;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a String

		// Approach 1
		String str = "madam";
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = ch.length - 1; i >= 0; i--) {
			sb.append(ch[i]);
		}
		System.out.println(sb);

		if (str.equals(sb.toString())) {
			System.out.println("String is Palindrome");
		}

		// Approach 2
		String str2 = "madam";
		StringBuffer sb2= new StringBuffer(str2);
		StringBuffer revSb = sb2.reverse();
		System.out.println(revSb);
	}

}
