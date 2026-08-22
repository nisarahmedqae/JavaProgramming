package string;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {
        // write java program to check whether two strings are anagram or not
        System.out.println(isAnagram("Listen", "Silent"));
        System.out.println(isAnagram("Li  ste n", "Sil en  t"));
        System.out.println(isAnagram("cat", "ACT"));
        System.out.println(isAnagram("lives", "lones"));
    }

    public static boolean isAnagram(String s1, String s2) {

        String str1 = s1.replaceAll("[ ]+", "");
        String str2 = s2.replaceAll("[ ]+", "");

        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] charArr1 = str1.toLowerCase().toCharArray();
            char[] charArr2 = str2.toLowerCase().toCharArray();

            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            return Arrays.equals(charArr1, charArr2);
        }
    }

}
