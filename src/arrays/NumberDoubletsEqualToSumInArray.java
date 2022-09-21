package arrays;

import java.util.HashSet;

public class NumberDoubletsEqualToSumInArray {

	public static void main(String[] args) {


		int arr[]= {1,2,3,6,7,9,5};
		int number=12;
		disp(arr,number);
	}
	
	
	public static void disp(int[] arr,int number)
	{
		
		
		boolean flag=false;
		
		HashSet<Integer> s=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			
			int sum=number-arr[i];
			
			
			

				if(s.contains(sum))
				{
					
					System.out.println("doublets found: " +arr[i] +" " +sum);
					flag=true;
				}
				
				s.add(arr[i]);
			}
			
		
		if(flag==false)
		{
			System.out.println("Doublets not found");
		}
	}


}
