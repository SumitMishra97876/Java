package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ShiftZeroesLeft_NonZeroesDescending {
	public static void main(String[] args) {
	
int[] arr= {1,0,3,4,7,0,8,0,6,0,0,0,5};
		
		test(arr);

	}
	
	public static void test(int[] arr)
	{
		Integer[] arr1=Arrays.stream(arr).boxed().toArray(Integer[]::new);
		Arrays.sort(arr1,Comparator.reverseOrder());
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]!=0)
				{
					if(arr1[i]>arr1[j])
					{
						int temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
					}
				}
			}
			
			
		}
		System.out.println(Arrays.toString(arr1));
	}

}
