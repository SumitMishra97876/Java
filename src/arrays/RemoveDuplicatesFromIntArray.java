package arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromIntArray {

	public static void main(String[] args) {


		int[] arr= {2,5,6,4,58,9,80,22,23,21,14,12,22,19,12,14,23,19};
		
		removeDups(arr);

	}
	
	public static void removeDups(int[] arr)
	{
		Integer[] arr1=Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		Set<Integer> set=new LinkedHashSet<>();
		System.out.print("Duplicates are : " );
		for(Integer i:arr1)
		{
			if(!set.add(i))
			{
				System.out.print(i + " ");
				
			}
		}
		System.out.println();
		System.out.println(set);
		
		
	}

}
