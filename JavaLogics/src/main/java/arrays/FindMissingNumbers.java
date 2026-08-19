package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbers {

	public static void main(String[] args) {
		int[] arr = { 3, 0, 1, 6, 4, -2 };

		// Determine the minimum and maximum values in the array
		int min = 0;
		int max = 0;
		List<Integer> oriList = new ArrayList<>();

		for (int ele : arr) {
			if (ele < min) {
				min = ele;
			}
			if (ele > max) {
				max = ele;
			}
			oriList.add(ele);
		}

		// Collect the missing numbers
		List<Integer> missingList = new ArrayList<>();

		for (int i = min; i <= max; i++) {
			if (!oriList.contains(i)) {
				missingList.add(i);
			}
		}

		System.out.println("Missing numbers: " + missingList); // Output: [-1, 2, 5]
	}
}