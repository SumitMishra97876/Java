package arrays;

public class MissingNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,3,4,5,7,8,10};
     
     test(arr);
	}
	
	public static void test(int[] arr)
	{
		int num=arr.length;
		int sum=((num+1)*(num+2))/2;
		
		for(int i=0;i<num;i++)
		{
			sum=sum-arr[i];
		}
		
		System.out.println("Missing num is" + sum);
	}

}
