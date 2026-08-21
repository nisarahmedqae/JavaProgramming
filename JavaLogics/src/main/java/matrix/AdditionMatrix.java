package matrix;

public class AdditionMatrix {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }

        int[][] matrix2 = {
                {10, 17, 13},
                {15, 11, 16},
                {14, 18, 12}
        };

        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] add = new int[row][col];
        int[][] sub = new int[row][col];

        System.out.println("Sum of two matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                add[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Subtraction of two matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }

}
