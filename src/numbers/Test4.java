package numbers;

public class Test4 {

	public static void main(String[] args) {

		int num =99;
		//int num=38;
		System.out.println(test(num));

	}
	
	
	public static int test(int num)
	{
		if(num==0)
		{
			return 0;
		}
		else if(num%9==0)
		{
			return 9;
		}
		else
		{
			return num%9;
		}
		
		
	}
}