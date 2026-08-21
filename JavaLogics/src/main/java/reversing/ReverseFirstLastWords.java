package reversing;

public class ReverseFirstLastWords {

    public static void main(String[] args) {

        String str = "    my name is gaurav             ";
        String[] words = str.trim().split(" ");
        int firstIndex = 0;
        int lastIndex = words.length - 1;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (i == firstIndex || i == lastIndex) {
                char[] charArr = word.toCharArray();
                StringBuilder reversedWord = new StringBuilder();
                for (int j = charArr.length - 1; j >= 0; j--) {
                    reversedWord.append(charArr[j]);
                }
                result.append(reversedWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }

}