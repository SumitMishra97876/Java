package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbersInARangeUsingStreams {

	public static void main(String[] args) {

      
        long primeount=	Stream.iterate(0, n->n+1)
		.limit(100)
		.filter(PrimeNumbersInARangeUsingStreams::isNumPrime)
		.peek(x->System.out.println(x))
		.count();
		
		System.out.println(primeount);
		
		
      // System.out.println(isNumPrime(11));
	}
	
	public static boolean isPrime(int number)
	{
		
		if(number<=1) return false;
		
		return !IntStream.rangeClosed(2, number/2).anyMatch(x->number%x==0);
		
		
		
	}
	
	public static boolean isNumPrime(int num)
	{
      boolean flag=true;
      
      if(num<=1) return false;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
				
			}
		}
		return flag;
		
		
		
	}

}
