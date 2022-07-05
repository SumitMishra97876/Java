package arrays;

public class ArrayRotateRight {

	public static void main(String[] args) {
int arr[]= {12, -9, 45, 23, -99, 67, 98, 90, 11, 45};
		
		int n=arr.length;
		int r=3;
		System.out.println("Array before rotation: ");   
		for(int i = 0 ; i < n ; i++)  
		{  
		//prints array before rotation  
		System.out.print(arr[i]+ " ");   
		}  
		System.out.println();  
		
		rotateRight(arr,r,n);
		
		System.out.println("\nArray after right rotation: ");   
		for(int i = 0 ; i < n ; i++)  
		{  
		//prints array after performing rotation      
		System.out.print(arr[i] + " ");  
		}   

	}
	
	public static void rotateRight(int arr[],int r,int n)
	{
		for(int i=0;i<r;i++)
		{
			rotateArrayBy(arr,n);
		}
	}

	public static void rotateArrayBy(int[] arr, int n) {
		
		int i;
		int temp;
		temp=arr[n-1];
		
		for( i=n-1;i>0;i--)
		{
			arr[i]=arr[i-1];
			arr[i-1]=temp;
		}
		
	}

}
