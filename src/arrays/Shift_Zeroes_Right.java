package arrays;

import java.util.Arrays;

public class Shift_Zeroes_Right {

	public static void main(String[] args) {


		
		int[] arr= {1,0,1,0,0,1,1,1,1,0,0,1};
		
		
        System.out.println(Arrays.toString(disp(arr)));
	}
	
	public static int[] disp(int[] arr)
	{
		
		int[] arr1=new int[arr.length];
		int count=0;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==1)
			{
				arr1[count]=arr[i];
				count++;
			}
		}
		
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=1)
			{
				arr1[count]=arr[i];
				count++;
			}
		}
		
		return arr1;
		
	}
		
    

}
