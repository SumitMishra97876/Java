package string_manipulations;

import java.util.Arrays;

public class OccurencesOfSubStringInString {

	public static void main(String[] args) {


		String str="Sab/retooth/";
		
		String subStr="/";
		
		int freqency=print(str,subStr);
		//int freqency=count(str,subStr);
		
		System.out.println(freqency);
	}
	
	public static int print(String str,String subStr)
	{
		
		return str.split(subStr, -1).length-1;
		
		
		
	}
	
	public static int count(String str, String subStr) {
	    return (str.length() - str.replace(subStr, "").length()) / subStr.length();
	}

}
