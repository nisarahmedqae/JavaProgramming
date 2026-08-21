package maths;

public class LeaderElements {

	// find out all the leader elements in a given array

	public static void findLeaders(int[] arr) {
		if (arr.length == 0) {
			return;
		}

		int max = arr[arr.length - 1];
		System.out.print(max + " ");

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.print(max + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 92, 7, 12, 9, 8, 3 };
		findLeaders(arr);

		int[] arr1 = { 92, 11, 10, 9, 8, 14 };
		findLeaders(arr1);

		int[] arr2 = { 92, 11, 10, 9, 8, 14, 3, 3 };
		findLeaders(arr2);

		int[] arr3 = {};
		findLeaders(arr3);
	}

}
