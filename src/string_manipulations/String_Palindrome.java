package string_manipulations;

public class String_Palindrome {

	public static void main(String[] args) {
		
		stringPal("malayalam");
	}
	
	public static void stringPal(String str)
	{
		if(str==null)
		{
			System.out.println("Please enter non null string");
		}
		else if(str.equals(""))
		{
			System.out.println("Enter proper string");
		}
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("given strig is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}

}
