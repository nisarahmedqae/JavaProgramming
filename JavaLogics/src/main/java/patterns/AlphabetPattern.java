package patterns;

public class AlphabetPattern {

    /*
    A
    A B
    A B C
    A B C D
    A B C D E
     */
    public static void main(String[] args) {

        int A = 65; // A=65 // a=97

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (A + j) + " ");
            }
            System.out.println();
        }

    }

}
