package string_manipulations;

import java.util.Arrays;

public class Printing_String_With_Spaces {

	public static void main(String[] args) {
		
		String str="MyNameIsJack";
		//String str="mYnAMEiSjACK";
		
		
		
		System.out.println(stringWithSpace(str));
		

	}
	
	public static String stringWithSpace(String str)
	{
		int len=str.length();
		
		String newStr="";
		
		String[] strArr=str.split("(?=\\p{Upper})");
		//String[] strArr=str.split("(?=\\p{Lower})");
		
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0;i<strArr.length;i++)
		{
			newStr=newStr+" "+strArr[i];
		}
		
		return newStr;
		
		
	}

}
