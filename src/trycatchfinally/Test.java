package trycatchfinally;

public class Test {

	
	String name;
	public static void main(String[] args) {
		
		Test test=new Test();
		test.name="Sumit";
		test=null;
		try
		{
			System.out.println(test.name);
			
			//int a=9/0;
			
			System.out.println("From try");
			
			
		}
		catch(Exception e)
		{
			System.out.println("From catch");
			
		}
		try
		{
			
			
			int a=9/0;
			
			System.out.println("From try2");
			
			
		}
		
		catch(Exception e)
		{
			System.out.println("From catch1");
			
		}
		
		finally
		{
			System.exit(1);
			System.out.println("From finally");
		}
	}

}
