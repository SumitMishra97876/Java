package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinFromArray {

	public static void main(String[] args) {

     int[] arr= {13,56,24,12,98,8};
     
     disp(arr);

	}
	
	public static void disp(int[] arr)
	{
		
		//List<Integer> alist=Arrays.asList(arr);
		List<Integer> alist  = Arrays.stream( arr).boxed().collect( Collectors.toList() );
		
		int min=alist.stream().min((i1,i2)->i1.compareTo(i2)).get();
		int max=alist.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println(min);
		System.out.println(max);
		
	}

}
