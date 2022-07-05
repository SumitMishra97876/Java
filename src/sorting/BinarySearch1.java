package sorting;

import java.util.Arrays;

public class BinarySearch1 {

	public static void main(String[] args) {
		
		int arr[]= {1,3,45,6,8,9,16,87};
		int last=arr.length-1;
		int key=45;
		bsearch(arr,0,last,key);
	}
	
	public static void bsearch(int arr[],int first,int last,int key)
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
				 System.out.println("Element is found at index: " + mid);  
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
			System.out.println("Element is not found!");  
		}
	}

}
