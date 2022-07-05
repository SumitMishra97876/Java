package string_manipulations;

public class StringPal {

	public static void main(String[] args) {
		pal("madam");
	}
    public static void pal(String str)
    {
    	String rev="";
    	
    	for(int i=str.length()-1;i>=0;i--)
    	{
    		rev=rev+str.charAt(i);
    	}
    	
    	if(rev.equals(str))
    	{
    		System.out.println("Palindrome");
    	}
    	else
    	{
    		System.out.println("Not Palindrome");
    	}
    }
}
