package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNumbersForProduct {

	public static void main(String[] args) {
		
       Integer arr[]= {1,4,6,8,9,5,11};
       test(arr);
	}
	
	public static void test(Integer arr[])
	{
		Arrays.sort(arr, Comparator.reverseOrder());
		
		int max=arr[0];
		int secondMax=arr[1];
		
		System.out.println("Max " +max);
		System.out.println("SecondMax " +secondMax);
		System.out.println("Product" +max*secondMax);
		
	}
	

}
