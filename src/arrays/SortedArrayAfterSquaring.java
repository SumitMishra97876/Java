package arrays;

import java.util.Arrays;

public class SortedArrayAfterSquaring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		
		 int arr[]= {-1,-8,6,5};
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=arr[i]*arr[i];
			 
		 }
		 
		 Arrays.sort(arr);
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i] + " ");
		 }
	}

}
