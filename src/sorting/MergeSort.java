package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int arr[]= {23,98,67,56,34,112,543,987,567,33,98,456};
		
		System.out.println("UnSorted Array in Ascending Order ");
	    System.out.println(Arrays.toString(arr));
	    
	    mergeSort(arr);
	    
	    System.out.println("Sorted Array in Ascending Order ");
	    System.out.println(Arrays.toString(arr));

	}
	
	
	public static void mergeSort(int[] arr)
	{
		int arrLength=arr.length;
		
		if(arrLength<2)
		{
			return;
		}
		
		int midIndex=arrLength/2;
		
		int[] leftArr= new int[midIndex];
		
		int[] rightArr=new int[arrLength-midIndex];
		
		for(int i=0;i<midIndex;i++)
		{
			leftArr[i]=arr[i];
		}
		
		for(int i=midIndex;i<arrLength;i++)
		{
			rightArr[i-midIndex]=arr[i];
		}
		
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(arr,leftArr,rightArr);
	}
	
	public static void merge(int[] arr,int[] leftArr,int[] rightArr)
	{
		int leftSize=leftArr.length;
		int rightSize=rightArr.length;
		
		
		int i=0,j=0,k=0;
		
		while(i<leftSize && j<rightSize)
		{
			if(leftArr[i]<=rightArr[j])
			{
				arr[k]=leftArr[i];
				i++;
			}
			else
			{
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i<leftSize)
		{
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<rightSize)
		{
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}

}
