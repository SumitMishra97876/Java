package arrays;

public class Test2 {

	public static void main(String[] args) {
		
		
		
		int[] arr1= {1,1,1};
		int[] arr2= {2,2,2};
		
		
		int sum=0;
		
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				sum=sum+arr2[j]+arr1[i];
			}
		}
		System.out.println(sum);

	}

}
