package string_manipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_SpecailChars_Not_Replace {

	public static void main(String[] args) {
		
		
		String str="To$day is Wed#nesday";
//		
//		System.out.println(str.indexOf("$"));
//		
//		String str1="We$dnesday is# Today";
//		System.out.println(str1.indexOf("$"));
		
		test(str);
//		
		
	}
	
	public static void test(String str)
	{
		int dollarindex=0 ;
		int hashindex=0 ;
		if(str.contains("$") & str.contains("#"))
		{
			dollarindex=str.indexOf("$");
			hashindex=str.indexOf("#");
		}
		
		
		String[] arr=str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		int len=arr.length;
		
		
		for(int i=arr.length/2;i>=0;i--)
		{
			
			String temp=arr[i];
			
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
		String srr="";
		
		for(int i=0;i<arr.length;i++)
		{
			srr=srr+arr[i] + " ";
		}
		System.out.println(srr);
		
		String newArr="";
		
		 newArr=newArr+srr.replaceAll("[^A-Z a-z]", "");
		
		System.out.println(newArr);
		
		String modArr="";
		
		for(int i=0;i<newArr.length();i++)
		{
			modArr=modArr+newArr.charAt(i);
			
			if(i==dollarindex & i==hashindex)
			{
				modArr=modArr+"$";
			}
			
			
		}
		System.out.println(modArr);
		
		
		
		
		
		
		
	}

}
