package arrays;

import java.util.HashSet;

public class NumberTripletsEqualToSumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {1,2,3,6,7,9};
		int number=27;
		disp(arr,number);
	}
	
	
	public static void disp(int[] arr,int number)
	{
		
		
		boolean flag=false;
		
		HashSet<Integer> s=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			
			int curr_num=number-arr[i];
			
			for(int j=i+1;j<arr.length;j++)
			{
				int curr_sum=curr_num-arr[j];
				if(s.contains(curr_sum))
				{
					
					System.out.println("triplets found: " +arr[i] +" " +arr[j]+" "+curr_sum);
					flag=true;
				}
				
				s.add(arr[j]);
			}
			
		}
		if(flag==false)
		{
			System.out.println("Triplets not found");
		}
	}

}
