package trycatchfinally;

public class Test {

	public static void main(String[] args) {
		try
		{
			
			int a=9/0;
			
			System.out.println("From try");
			
			
		}
		catch(Exception e)
		{
			System.out.println("From catch");
			
		}
		finally
		{
			System.exit(1);
			System.out.println("From finally");
		}
	}

}
