package arrays;

import java.util.Arrays;

public class ShiftZeroesLeft1 {

	public static void main(String[] args) {
		int[] arr= {1,0,3,4,7,0,8,0,6,0,0,0,5};
		
		
		System.out.println(Arrays.toString(shiftLeft(arr)));
		
		
		

	}
	
	public static int[] shiftLeft(int[] arr)
	{
		int[] arr1=new int[arr.length];
		
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr1[count]=arr[i];
				count++;
			}
		}
		for(int i=0;i<arr.length;i++)
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
