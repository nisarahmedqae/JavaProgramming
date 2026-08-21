package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrixThroughTerminal {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter total columns: ");
        int cols = scanner.nextInt();

        // 2D Array
        int matrix[][] = new int[rows][cols];

        System.out.println("Please enter the matrix data: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Row:" + i + " Column:" + j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
