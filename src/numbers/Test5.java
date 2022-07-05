package numbers;

public class Test5 {

	public static void main(String[] args) {
		int num1=12123123;
		
		while(num1>9)
		{
			num1=getSum(num1);
		}
		
		System.out.println("Sum of the given num in one digit is:" +num1);
	}
	
	public static int getSum(int number)
	{
		int num=number;
		
		int rem;
		int sum=0;
	    
		while(num>=1)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}

}
