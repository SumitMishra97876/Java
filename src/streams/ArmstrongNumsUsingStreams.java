package streams;

import java.util.stream.Stream;

public class ArmstrongNumsUsingStreams {

	public static void main(String[] args) {

		
		
	long ArmstrongCount=Stream.iterate(0, n->n+1)
		.limit(2000)
		.filter(ArmstrongNumsUsingStreams::isArmstrong)
		.peek(x->System.out.println(x))
		.count();


	System.out.println(ArmstrongCount);
	}

	
	
	public static boolean isArmstrong(int number)
	{
		
		int n=order(number);
		
		int temp=number;
		int sum=0;
		while(temp!=0)
		{
			int r=temp%10;
			sum=sum+ (int)Math.pow(r, n);
			temp=temp/10;
		}
		return (sum==number);
	}
	
	public static int order(int number)
	{
		
		int n=0;
		while(number>0)
		{
			n++;
			number=number/10;
		}
		return n;
		
	}
}
