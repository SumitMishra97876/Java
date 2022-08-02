package test;

public class Test4 {

	public static void main(String[] args) {


		
		parse("5");

	}
	
	public static void parse(String str)
	{
		
		
		float f=0;
		try
		{
			f=Float.parseFloat(str);
		}
		catch(NumberFormatException e)
		{
			f=0;
		}
		finally
		{
			System.out.println(f);
		}
	}

}
