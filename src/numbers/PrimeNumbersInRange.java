package numbers;

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		primeNums(50);

	}
	
	public static void primeNums(int range)
	{
		
		int n=0;
		String primeNums="";
		
		for(int i=0;i<=range;i++)
		{
			int counter=0;
			for( n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2)
			{
				primeNums=primeNums+i+" ";
			}
		}
		System.out.print(primeNums);
		
	}

}
