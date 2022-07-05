package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraySort {

	public static void main(String[] args) {
		Integer arr[]= {1,6,9,4,0};
		
		sort(arr);
	}
	
	public static void sort(Integer arr[])
	{
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(arr));
		
		ArrayList<Integer>ar1=(ArrayList<Integer>) ar.stream().sorted().collect(Collectors.toList());
		
		for(Integer i:ar1)
		{
			System.out.print(i + " ");
		}
		
		
	}

}
