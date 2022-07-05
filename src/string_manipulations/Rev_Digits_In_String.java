package string_manipulations;

public class Rev_Digits_In_String {

	public static void main(String[] args) {
		
		String str="Apple123";
		
		test(str);
		

	}
	
	public static void test(String str)
	{
		String digs="";
		String revDigs="";
		String str1="";
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				digs=digs+str.charAt(i);
			}
			if(!Character.isDigit(str.charAt(i)))
			{
				str1=str1+str.charAt(i);
			}
		}
		
		for(int i=digs.length()-1;i>=0;i--)
		{
			revDigs=revDigs+digs.charAt(i);
		}
		
		str1=str1+revDigs;
		System.out.println(str1);
	}

}
