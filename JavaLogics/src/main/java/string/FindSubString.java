package string;

import java.util.Arrays;
import java.util.regex.Pattern;

public class FindSubString {

    public static void main(String[] args) {
        // check if substring is present in a given string

        String str = "The quick! brown fox jumps over the lazy dog";
        String wordToFind = "quick";

        String[] words = str.split("[ ]+");
        boolean foundViaList = Arrays.asList(words).contains(wordToFind);
        System.out.println("Found (list): " + foundViaList); //false

        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(wordToFind) + "\\b");
        boolean foundViaRegex = pattern.matcher(str).find();
        System.out.println("Found (regex): " + foundViaRegex); //true

    }

}
