package string_manipulations;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		
      System.out.println(rec("Sumit"));
	}
	
	public static String rec(String str)
	{
		if(str.isEmpty())
		{
			System.out.println("Empty");
		}
		return rec(str.substring(1)+str.charAt(0));
	}

}
