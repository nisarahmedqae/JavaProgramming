package matrix;

import java.util.Arrays;

public class PatternPrint {

    /*
    [1, 0, 0, 1]
    [0, 2, 0, 2]
    [0, 0, 3, 3]
    [0, 0, 0, 4]
     */
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row == col) {
                    matrix[row][col] = row + 1;
                } else if (col == 3) {
                    matrix[row][col] = row + 1;
                } else {
                    matrix[row][col] = 0;
                }
            }
        }
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}