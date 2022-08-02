package arrays;

public class EvenDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		int arr[]= {123,4567,89078,56,897876};
		
		
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			
			//String nums=Integer.toString(num);
			String nums=String.valueOf(num);
			
			if(nums.length()%2==0)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
