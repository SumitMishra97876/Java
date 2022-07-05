package arrays;

import java.util.Arrays;

public class ShiftZeroesLeft_NonZeroesDescending {
	public static void main(String[] args) {
	
int[] arr= {1,0,3,4,7,0,8,0,6,0,0,0,5};
		
		test(arr);

	}
	
	public static void test(int[] arr)
	{
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]!=0)
				{
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
