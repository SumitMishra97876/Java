package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 23, 56, 44, 89, 123 };

		disp1(arr);

	}

	public static void disp(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = revNum(arr[i]);
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void disp1(int arr[]) {
       
	List<Integer>list=	Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().map(ReverseEachNumberInArray::revNum).collect(Collectors.toList());
		
		System.out.println(list);
	}

	public static int revNum(int num) {

		int rev = 0;
		int sum = 0;

		while (num > 0) {
			rev = num % 10;
			sum = sum * 10 + rev;
			num = num / 10;
		}
		return sum;
	}

}
