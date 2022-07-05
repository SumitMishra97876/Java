package arrays;

public class Adding_Arrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 1, 1 };
		int[] arr2 = { 2, 2, 2 };

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < arr1.length; i++) {
			sum1 = sum1 + arr1[i];
		}

		for (int j = 0; j < arr2.length; j++) {
			sum2 = sum2 + arr2[j];
		}

		System.out.println("Sum of 2 arrays : " + (sum1 + sum2));

	}

}
