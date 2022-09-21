package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumberFromArary {

	public static void main(String[] args) {


		int arr[]= {23,76,45,32,89,67,110};
		findSecMax(arr);
		

	}
	
	public static void findSecMax(int[] arr)
	{
		
		Arrays.sort(arr);
		
		
		int largest=arr[arr.length-1];
		int secondLargest=arr[arr.length-2];
		int thirdlargest=arr[arr.length-3];
		
		System.out.println("The largest Number from the Array is " +largest);
		System.out.println("2nd largest Number from the Array is " +secondLargest);
		System.out.println("3rd largest Number from the Array is " +thirdlargest);
	}

}
