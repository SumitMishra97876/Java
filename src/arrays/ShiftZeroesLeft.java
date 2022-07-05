package arrays;

import java.util.Arrays;

public class ShiftZeroesLeft {

	public static void main(String[] args) {
		
		int[] arr={1,0,2,0,3,0,0,0};
		System.out.println(Arrays.toString(shiftZeroes(arr)));
		
	}
		

	
	public static int[] shiftZeroes(int[] arr)
	{
		
        int[] arr1=new int[arr.length];
		
		int count=0;
		
//		for(int i=0;i<arr.length;i++)
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=0)
			{
				arr1[count]=arr[i];
				count++;
			}
		}
		//Arrays.sort(arr1);
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=1;j<arr1.length;j++)
			{
				if(arr1[i]!=0)
				{
					if(arr1[i]<arr1[j])
					{
						int temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
					}
				}
			}
		}
		
		return arr1;
	}

}

