package arrays;

public class Biggest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {20,90,87,65,89,101,565,154,987,9,0,8,765,11234};
		
		int big=arr[0];
		int lowest=arr[0];
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>big)
			{
				big=arr[i];
				
			}
			
			if(arr[i]<lowest)
			{
				lowest=arr[i];
			}
		}
		System.out.println("biggest element is " + big);
		System.out.println("lowest element is " + lowest);

	}

}
