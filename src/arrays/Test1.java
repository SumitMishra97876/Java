package arrays;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		int nums[]= {0,-1,-1,-2,2,3};
		test(nums);
		
	}
	
	
	public static void test(int[] nums)
	{
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		for(int i=0;i<nums.length;i++)
		{
			int start=i+1;
			int end=nums.length-1;
			
			while(start<=end)
			{
				int sum=nums[i]+nums[start]+nums[end];
				if(sum==0)
				{
					System.out.print(nums[i]+ " "+ nums[start]+ " "+nums[end]);
					System.out.println("");
					start++;
					end--;
				}
				else if(sum>0)
				{
					end--;
				}
				else
				{
					start++;
				}
			}
		}
		
		
		
	}

}
