package arrays;

public class ArrayRotateLeft {

	public static void main(String[] args) {
		
		
		int arr[]= {1,3,5,6,7};
		
		int n=arr.length;
		int r=1;
		System.out.println("Array before rotation: ");   
		for(int i = 0 ; i < n ; i++)  
		{  
		//prints array before rotation  
		System.out.print(arr[i]+ " ");   
		}  
		System.out.println();  
		
		rotateLeft(arr,r,n);
		
		System.out.println("\nArray after left rotation: ");   
		for(int i = 0 ; i < n ; i++)  
		{  
		//prints array after performing rotation      
		System.out.print(arr[i] + " ");  
		}   
	}
	
	public static void rotateLeft(int arr[],int r,int n)
	{
		for(int i=0;i<r;i++)
		{
			rotateArrayBy(arr,n);
		}
	}

	public static void rotateArrayBy(int[] arr, int n) {
		
		int i;
		int temp;
		temp=arr[0];
		
		for(i=0;i<n-1;i++)
		{
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
	}

}
