package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FindLargestAndSecondLargestFromArrayThenDoproduct {

	public static void main(String[] args) {

     int arr[]= {13,45,23,89,67};
     
     prod(arr);
     
     
		
		

	}
	public static void prod(int[] arr)
	{
		
		Integer[] arr1=Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		Arrays.sort(arr1,Comparator.reverseOrder());
		
		int largest=arr1[0];
		int lowest=arr1[arr1.length-1];
		System.out.println(lowest);
		
		
		System.out.println("Product is " +(largest*lowest));
		
		
	}

}
