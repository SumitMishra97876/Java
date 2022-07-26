package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShiftZeroesRight {

	public static void main(String[] args) {

		
		//int[] arr= {1,0,1,0,0,1,1,1,1,0,0,1};
		int[] arr= {3,0,2,7,9,0,1,0,1,0,0,0,1};	
			
		//disp(arr);
			System.out.println(Arrays.toString(shifRight(arr)));
			


	}
	
	public static int[] shifRight(int[] arr)
	{
		int[] arr1=new int[arr.length];
		
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr1[count]=arr[i];
				count++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr1[count]=arr[i];
				count++;
			}
		}
		return arr1;
	}
	
	
	public static void disp(int[] arr)
	{
	  
		
		List<Integer>l=Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(l,(i1,i2)->i1<i2?1:i1>i2?-1:0);
		System.out.println(l);

	}
}
