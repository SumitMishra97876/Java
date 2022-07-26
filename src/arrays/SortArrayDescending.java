package arrays;

import java.util.Arrays;

public class SortArrayDescending {

	public static void main(String[] args) {
		int arr[]= {3,9,8,5,1,12};
		print(arr);
		

	}
	
	public static void print(int[] arr)
	{
		Arrays.sort(arr);
		//int arr1[]=new int[arr.length];
		//int n=arr1.length;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+ " ");
		}
		
		
	}

}
