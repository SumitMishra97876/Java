package numbers;

public class PrimeNumber {

	public static void main(String[] args) {
	
		primeNum(29);
	}
	
	public static void primeNum(int num)
	{
		boolean flag=true;
		
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}

}
