package arrays;

import java.util.Arrays;

public class DuplicatesUsingSorting {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5, 6, 5,8,7,9,8 };
		sortDuplicates(arr);

	}

	public static void sortDuplicates(int[] arr) {
		Arrays.sort(arr);
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("Duplicate number is : " + arr[i]);
				flag = true;
			}

		}
		if (flag == false) {
			System.out.println("No Duplicates found");
		}
	}

}
