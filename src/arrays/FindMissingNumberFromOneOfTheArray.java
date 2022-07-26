package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMissingNumberFromOneOfTheArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int[] arr2 = { 2, 3, 4, 5, 6, 7, 9, 10, 12, 18 };

		disp(arr1, arr2);

	}

	public static void disp(int[] arr1, int[] arr2) {

		List<Integer> l1 = Arrays.stream(arr1).boxed().sorted().collect(Collectors.toList());

		List<Integer> l2 = Arrays.stream(arr2).boxed().sorted().collect(Collectors.toList());

		l1.removeAll(l2);

		System.out.println("Missing Number is " + l1);

	}

}
