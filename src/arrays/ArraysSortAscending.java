package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ArraysSortAscending {

	public static void main(String[] args) {

      int[] arr= {2,5,8,9,21,12,45,33};
      sortArr(arr);
	}
	
	public static void sortArr(int[] arr)
	{
		Stream<Integer> arr1=Arrays.stream(arr).boxed();
		
//		
		Integer[] arr2=arr1.toArray(Integer[]::new);
//		
		Arrays.sort(arr);
		//Arrays.sort(arr2, (i1,i2)->i1>12?-1:i1<i2?1:0);
		Arrays.sort(arr2, (i1,i2)->i1>i2?-1:i1<i2?1:0);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

}
