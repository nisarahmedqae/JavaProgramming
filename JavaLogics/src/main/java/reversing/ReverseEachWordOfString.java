package reversing;

public class ReverseEachWordOfString {

    public static void main(String[] args) {
        String str = "Welcome To Java"; // original string
        String[] splittedStr = str.split(" "); // splitting string into words
        StringBuilder sb = new StringBuilder();

        for (String word : splittedStr) { // welcome
            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }

        System.out.println(sb); // Move to the next line after printing all reversed words
    }
}