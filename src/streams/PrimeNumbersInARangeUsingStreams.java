package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbersInARangeUsingStreams {

	public static void main(String[] args) {

      
        long primeount=	Stream.iterate(0, n->n+1)
		.limit(100)
		.filter(PrimeNumbersInARangeUsingStreams::isPrime)
		.peek(x->System.out.println(x))
		.count();
		
		System.out.println(primeount);

	}
	
	public static boolean isPrime(int number)
	{
		
		if(number<=1) return false;
		
		return !IntStream.rangeClosed(2, number/2).anyMatch(x->number%x==0);
		
		
		
	}

}
