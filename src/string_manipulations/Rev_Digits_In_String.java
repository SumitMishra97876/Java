package string_manipulations;

import java.util.Arrays;

public class Rev_Digits_In_String {

	public static void main(String[] args) {
		
		String str="Apple123Banana654";
		
		//test(str);
		revDigits(str);
		

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
	
	public static void revDigits(String str)
	{
		String[] sarr=str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		
		for(int i=0;i<sarr.length;i++)
		{
			if(!Character.isLetter(sarr[i].charAt(0)))
			{
				sarr[i]=rev(sarr[i]);
			}
		}
		
		String s2 = String.join("", sarr);

		System.out.print(s2);
		
		
	}
	public static String rev(String str) {

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		return rev;
	}

}
