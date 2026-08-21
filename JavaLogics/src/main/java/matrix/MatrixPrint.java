package matrix;

import java.util.Arrays;

public class MatrixPrint {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Basic nested loop — most common, full control over formatting
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }

        // Using enhanced for-each loops (cleaner syntax, same result)
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // quick one-liner for debugging
        System.out.println(Arrays.deepToString(matrix));
    }

}
