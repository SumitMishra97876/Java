package arrays;

public class MaxCountOfConsecutiveElementsFromArray {

	public static void main(String[] args) {

     int[] arr= {1,1,1,0,0,1,1,1,1,1};
     
     disp(arr,1);

	}
	
	public static void disp(int[] arr, int element)
	{
		int count=0;
		int max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==element)
			{
				count=count+1;
				max=Math.max(max, count);
			}
			else
			{
				count=0;
			}
			
			
			
		}
		
		System.out.println("Max Count of " +element+ " is " +max);
		
	}

}
