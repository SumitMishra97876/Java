package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinFromArray {

	public static void main(String[] args) {

     int[] arr= {13,56,24,12,98,8,34,567,897,564,456};
     
     disp(arr);

	}
	
	public static void disp(int[] arr)
	{
		
		//List<Integer> alist=Arrays.asList(arr);
		List<Integer> alist  = Arrays.stream( arr).boxed().collect( Collectors.toList() );
		
		//int min=alist.stream().min((i1,i2)->i1.compareTo(i2)).get();
		int min=alist.stream().min(Integer::compare).get();  //for this first convert array to list
		//int max=alist.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		int max=alist.stream().max(Integer::compare).get();
		
		//finding second largest num
		
		int secondLargest=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
		
		//find second lowest
		
		int secondLowest=Arrays.stream(arr).boxed().sorted().limit(2).skip(1).findFirst().get();
		
		
		//finding highest using Arrays.stream
		
		int lowest=Arrays.stream(arr).boxed().sorted().limit(2).findFirst().get();
		
		//finding largest using Arrays.stream
		
     	int largest=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(1).findFirst().get();
     	
     	//find 3rd largest
     	
     	int thirdLargest=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(3).skip(2).findFirst().get();
     	int fourthLargest=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(5).skip(4).findFirst().get();
		System.out.println(min);
		System.out.println(max);
		System.out.println(secondLargest);
		System.out.println(secondLowest);
		System.out.println(lowest);
		System.out.println(largest);
		System.out.println(thirdLargest);
		System.out.println(fourthLargest);
		
	}

}
