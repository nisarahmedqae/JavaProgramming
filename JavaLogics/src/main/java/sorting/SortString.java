package sorting;

public class SortString {

    public static void main(String[] args) {
        String str = "defabcghi";
        char[] charArr = str.toCharArray();

        System.out.println("String before sorting: " + new String(charArr));

        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {

                if (charArr[i] < charArr[j]) {
                    char temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                }
            }
        }

        System.out.println("String after sorting: " + new String(charArr));

    }

}
