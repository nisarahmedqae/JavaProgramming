package matrix;

public class MultiDimensionalArray {

    /*
    Anytime you're looping down a fixed column (varying the row index),
    your bound should be matrix.length. Anytime you're looping across a
    fixed row (varying the column index), your bound should be matrix[i].length
     */
    public static void main(String[] args) {
        // 1. Print min number from matrix
        // 2. Print max number from same column

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int minValue = matrix[0][0];
        int minColumn = 0;

        for (int i = 0; i < matrix.length; i++) { // rows
            for (int j = 0; j < matrix[0].length; j++) { // columns
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                    minColumn = j;
                }
            }
        }
        System.out.println("Min column: " + minColumn);

        int max = matrix[0][minColumn];

        for (int k = 0; k < matrix.length; k++) { // fixed: iterate rows, not columns
            if (matrix[k][minColumn] > max) {
                max = matrix[k][minColumn];
            }
        }
        System.out.println("Max in that column: " + max);
    }
}