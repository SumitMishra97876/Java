package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {4,4,7,8,9};
		int target=15;
		
		int[] numberIndices=solution(nums,target);
		
		for(int i:numberIndices)
		{
			System.out.print(i + " ");
		}

	}
	
	
	public static int[] solution(int[] nums,int target)
	{
		
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<nums.length;i++)
		{
			Integer numIndex=map.get(nums[i]);
			if(numIndex!=null)
			{
				return new int[] {i,numIndex};
			}
			map.put(target-nums[i], i);
		}
		return nums;
	}

}
