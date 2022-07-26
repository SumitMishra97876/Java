package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysSortAscending {

	public static void main(String[] args) {

      int[] arr= {2,5,8,9,21,12,45,33};
      sortArr(arr);
	}
	
	public static void sortArr(int[] arr)
	{
//		Stream<Integer> arr1=Arrays.stream(arr).boxed();
//		
//		Integer[] arr2=arr1.toArray(Integer[]::new);
//		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
