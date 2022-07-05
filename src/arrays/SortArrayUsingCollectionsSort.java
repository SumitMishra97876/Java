package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayUsingCollectionsSort {

	public static void main(String[] args) {

     Integer arr[]= {1,9,8,7,5};
     
     test(arr);

	}
	public static void test(Integer arr[])
   {
	   System.out.println("Array before sort");
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.print(arr[i]+ " ");
	   }
	   System.out.println();
	   
	   Arrays.sort(arr, Comparator.reverseOrder());
	   
	   System.out.println("Array after sort");
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.print(arr[i]+ " ");
	   }
   }
}
