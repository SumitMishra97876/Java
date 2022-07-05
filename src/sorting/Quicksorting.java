package sorting;

import java.util.Arrays;

public class Quicksorting {

	public static void main(String[] args) {
		int arr[]= {23,90,87,65,33};
		int high=arr.length;
		
		System.out.println("UnSorted Array in Ascending Order ");
	    System.out.println(Arrays.toString(arr));
	
		
		quicksort(arr,0,high-1);
		
		  System.out.println("Sorted Array in Ascending Order ");
		    System.out.println(Arrays.toString(arr));
		

	}
    public static int partition(int arr[],int low,int high)
    {
    	int pivot=arr[high];
    	int i=(low-1);
    	
    	for(int j=low;j<high;j++)
    	{
    		if(arr[j]<=pivot)
    		{
    			i++;
    			int temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    			
    		}
    		
    	}
    	int temp=arr[i+1];
    	arr[i+1]=arr[high];
    	arr[high]=temp;
    	
    	return (i+1);
    }
    
    public static void quicksort(int arr[],int low,int high)
    {
    	
    	if(low<high)
    	{
    	int p=partition(arr,low,high);
    	quicksort(arr,low,p-1);
    	quicksort(arr,p+1,high);
    	}
    }
}
