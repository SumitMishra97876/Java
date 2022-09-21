package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortArrayDescending {

	public static void main(String[] args) {
		int arr[]= {3,9,8,5,1,12};
		print(arr);
		

	}
	
	public static void print(int[] arr)
	{
		Integer[] arr1=Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		//Arrays.sort(arr1, Comparator.reverseOrder());
		
		Arrays.sort(arr1, (i1,i2)->i1>i2?-1:i1<i2?1:0);
		
		System.out.println(Arrays.toString(arr1));
		
	}

}
