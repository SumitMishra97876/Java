package numbers;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		isaArmstrong(153);
	}
    
	
	public static void isaArmstrong(int n)
	{
		int temp;
		int a;
		int sum=0;
		temp=n;
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			sum=sum+(a*a*a);
		}
		if(temp==sum)
		{
			System.out.println("is Armstrong");
		}
		else
		{
			System.out.println("Is not armstrong");
		}
	}
}
