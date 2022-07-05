package numbers;

public class PalindromeNumber {

	public static void main(String[] args) {
		palindrome(454);
	}
	
	public static void palindrome(int n)
	{
		int d;;
		int sum=0;
		int temp=n;
		
		while(n>0)
		{
			d=n%10;
			sum=(sum*10)+d;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Number " +temp+ " is palindrome");
		}
		else
		{
			System.out.println("Number " +temp+ " is not palindrome");
		}
	}

}
