package arrays;

import java.util.HashSet;

public class TripletThatEqualToSumInArray {

	public static void main(String[] args) {



		
		
		int arr[]= {2,5,7,8,9};
		
		int number=16;
		
		disp(arr,number);
	}
	
	public static void disp(int arr[],int number)
	{
		
		
		HashSet<Integer> hs=new HashSet<Integer>();
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			int curr_num=number-arr[i];
			
			for(int j=i+1;j<arr.length;j++)
			{
				int curr_sum=curr_num-arr[j];
				if(hs.contains(curr_sum))
				{
					System.out.println(" Numeber triplets are : " +arr[i]+ " " +arr[j]+ " " +curr_sum);
					flag=true;
				}
				
				hs.add(arr[j]);
			}
		}
		
		if(flag==false)
		{
			System.out.println("Triplets not found");
		}
	}

}
