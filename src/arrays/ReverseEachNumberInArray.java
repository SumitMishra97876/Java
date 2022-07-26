package arrays;

public class ReverseEachNumberInArray {

	public static void main(String[] args) {

     int[] arr= {23,56,44,89,123};
     
     disp(arr);

	}
	
	public static void disp(int[] arr)
	{
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=revNum(arr[i]);
		}
		
		for(int i:arr)
		{
			System.out.print(i+ " ");
		}
	}
	
	public static int revNum(int num)
	{
		
		int rev=0;
		int sum=0;
		
		while(num>0)
		{
			rev=num%10;
			sum=sum*10+rev;
			num=num/10;
		}
		return sum;
	}

}
