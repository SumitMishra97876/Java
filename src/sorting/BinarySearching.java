package sorting;

import java.util.Arrays;

public class BinarySearching {

	public static void main(String[] args) {

        int[] arr= {22,23,56,78,98,78,65,34,43};
		int last=arr.length-1;
        binarySearch(arr,0,last,56);
		

	}
	
	public static void binarySearch(int[] arr,int first,int last,int key)
	{
		Arrays.sort(arr);
		
		int mid=(first+last)/2;
		
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("element found at index " +mid);
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		
		if(first>last)
		{
			System.out.println("element doesnt exist");
		}
		
		
	}

}
