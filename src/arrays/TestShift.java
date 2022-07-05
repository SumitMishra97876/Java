package arrays;

import java.util.Arrays;

public class TestShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,0,2,0,3,0,0,0,6,0,9,0,4,7,0};
		
		Arrays.sort(arr);
		
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
			
			if(arr[i]!=0)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		
		
	}
		System.out.println(Arrays.toString(arr));

}
}
