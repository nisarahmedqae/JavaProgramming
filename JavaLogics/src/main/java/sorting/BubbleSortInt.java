package sorting;

import java.util.Arrays;

public class BubbleSortInt {

    // sort the array in ascending and descending order
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 4, 9};
        System.out.println("Arrays before sorting: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Arrays after sorting: " + Arrays.toString(arr));
    }

}
