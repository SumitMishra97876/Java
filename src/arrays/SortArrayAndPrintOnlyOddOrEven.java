package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortArrayAndPrintOnlyOddOrEven {

	public static void main(String[] args) {
		
		Integer arr[]= {1,2,3,4,5,5,6,8,9,15,45,32,33,89};
		
		//sort(arr);
		
	List<Integer> alist=Arrays.stream(arr)
		.collect(Collectors.toList());
	
	         ArrayList<Integer>sortedList=(ArrayList<Integer>) alist.stream().sorted().filter(s->s%2!=0).collect(Collectors.toList());
	         
	       System.out.println(sortedList);
	       
	       Set<Integer> s=new LinkedHashSet<>(sortedList);
	       
	       System.out.println(s);
	       
	       

	}
	
	public static void sort(Integer[] arr)
	{
		Arrays.sort(arr);
		
		ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(arr));
		
		Set<Integer> hs=new LinkedHashSet<Integer>();
		
		hs.addAll(ar);
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		for(Integer a: hs)
		{
			if(a%2!=0)
			{
				ar1.add(a);
			}
		}
		
		for(Integer a: ar1)
		{
			System.out.print(a +" ");
		}
	}

}
