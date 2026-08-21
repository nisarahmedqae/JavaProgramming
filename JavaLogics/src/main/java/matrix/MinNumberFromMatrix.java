package matrix;

public class MinNumberFromMatrix {

    public static void main(String[] args) {
        // print min and max number in multi dimensional array 3*3 matrix

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int row = matrix.length;
        int column = matrix[0].length;

        System.out.println(row);
        System.out.println(column);

        int min = matrix[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println(min);
    }

}
