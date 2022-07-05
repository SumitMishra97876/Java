package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShiftZeroes {

	public static void main(String[] args) {
		int[] arr={1,0,2,0,3,0,0,0};
		
		System.out.println(Arrays.toString(shiftZeroes(arr)));
		//shiftZeroes(arr);
		

	}
	public static int[] shiftZeroes(int[] arr)
	{
		int[] arr1=new int[arr.length];
		
		
		int count=0;
		
     	for(int i=0;i<arr.length;i++)
		//for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=0)
			{
				
				
				
				arr1[count]=arr[i];
				count++;
			}
		}
		return arr1;
		
     
		
		
		
	}

}
