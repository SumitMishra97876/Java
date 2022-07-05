package numbers;

public class Reverse_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=80000;
		int temp;
		int rev=0;
		
		while(num>0)
		{
			temp=num%10;
			rev=(rev*10)+temp;
			num=num/10;
			System.out.print(rev);
			
			
		}
		if(rev==num)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		

	}

}
