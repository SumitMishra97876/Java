package trycatchfinally;

public class Test1 {

	public static void main(String[] args) {
		
		
		try
		{
			
			System.out.println("From try");
			System.exit(0);
			
			
		}
		catch(Exception e)
		{
			System.out.println("From Catch");
			
		}
		finally
		{
			System.out.println("From finally");
		}

	}

}
