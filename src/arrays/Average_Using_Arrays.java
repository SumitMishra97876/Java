package arrays;

public class Average_Using_Arrays {

	public static void main(String[] args) {
		
		
		int arr[]= {78,67,89,56,98};
		
		
		int len=arr.length;
		
		int sum=0;
		int avg=0;
		
		for(int i=0;i<len;i++)
		{
			sum=sum+arr[i];
			avg=sum/len;
			
			
		}
		System.out.println("total sum :" +sum);
		System.out.println("average :" +avg);

	}

}
