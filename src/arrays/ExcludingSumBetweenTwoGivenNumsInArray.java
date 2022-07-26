package arrays;

public class ExcludingSumBetweenTwoGivenNumsInArray {

	public static void main(String[] args) {

       int arr[]= {6,7,0,9,8,3,4,2,6,5};
       
       disp(arr,8,5);

	}
	
	
	public static void disp(int[] arr,int n1,int n2)
	{
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("total sum of Array: " +sum);
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n1)
			{
				for(int j=i;j<arr.length;j++)
				{
					if(arr[j]==n2)
					{
						i=j;
						break;
					}
				}
			}
			else
			{
				sum1=sum1+arr[i];
			}
		}
		System.out.println("Sum after excluding " +n1+ " " +n2 + "is: " +sum1) ;
	}

}
