package numbers;

public class Test6 {

	public static void main(String[] args) {
		int num=38;
		System.out.println(test(num));
		
	}
	
	
	public static int test(int num)
	{
		if(num<10)
		{
			return num;
		}
		return test(test1(num));
		
	}
	public static int test1(int num)
	{
		if(num==0)
		{
			return 0;
		}
		return(num%10 +test1(num/10));
	}

}
