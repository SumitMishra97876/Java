package arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		
		int arr[]= {0,1,0,1,1,0,1,1,1,1,1,   0};
		int count=0;
		int max=0;
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==1)
			{
				count=count+1;
				
				max=Math.max(max, count);
			}
			else
			{
				count=0;
			}
		}
		System.out.println(max);
	}

}
