package arrays;

public class FindAllMissingNumsFromArray {

	public static void main(String[] args) {
		
		
		int arr[]= {0,5,8,6,15};
		
		int N=arr.length;
		
		dispMissing(arr,N);

	}
	
	
	public static void dispMissing(int arr[],int N)
	{
		
		
		int[] b=new int[arr[N-1]+1];
		
		for(int i=0;i<N;i++)
		{
			b[arr[i]]=1;
		}
		
		for(int i=arr[0];i<=arr[N-1];i++)
		{
			if(b[i]==0)
			{
				System.out.println("Missing numbers are : " +i);
			}
		}
		
	}

}
