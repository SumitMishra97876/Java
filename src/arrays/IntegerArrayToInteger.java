package arrays;

public class IntegerArrayToInteger {

	public static void main(String[] args) {

      int[] arr= {1,2,3,4};
      
      System.out.println(intArrayToInt(arr));
		
		
	}
	
	
	public static int intArrayToInt(int[] arr)
	{
		
		
		int num=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			num=num*10+arr[i];
		}
		return num;
		
		
	}

}
