package integer;

import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args) {
        Random random = new Random();

        // 6-char random string (letters only)
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        System.out.println("6-char string: " + sb);

        // 7-digit random number (same pattern, digit pool)
        String digits = "0123456789";
        StringBuilder sbDigits = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            sbDigits.append(digits.charAt(random.nextInt(digits.length())));
        }
        System.out.println("7-digit string: " + sbDigits);
    }
}