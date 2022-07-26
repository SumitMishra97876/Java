package sorting;

public class Bubble_Sort {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 13, 12, 14,9,67,45 };

		for (int i = 0; i < arr.length-1; i++) {
			boolean isSorted = true;
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] >arr[j+1 ]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = false;
				}

			}
			if (isSorted)
				break;

		}

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}

}
