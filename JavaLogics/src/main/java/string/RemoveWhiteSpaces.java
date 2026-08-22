package string;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        // Remove all whitespaces from a string

        String str = "   This   is my java code";
        System.out.println(str.trim());

        String str2 = "   This   is my java code";
        System.out.println(str2.replaceAll("[ ]+", "")); // remove all white spaces

        System.out.println("---------------------------");
        String str4 = "   This   is my java code";
        String[] splitStr = str4.split("[ ]+");
        StringBuffer stringBuffer = new StringBuffer();

        for (String e : splitStr) {
            stringBuffer.append(e);
        }
        System.out.println(stringBuffer);
    }

}
