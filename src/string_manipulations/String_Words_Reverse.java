package string_manipulations;

import java.util.Arrays;

public class String_Words_Reverse {

	public static void main(String[] args) {
		
		String str="Selenium Learning 123 I am";
		test(str);
	}
	
	public static void test(String str)
	{
      //int len=str.length;
		
		
		String[] arr=str.split(" ");
		int len=arr.length;
		String rev="";
		
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
			rev=rev+arr[i]+" ";
			
//			String temp=arr[i];
//			
//			arr[i]=arr[len-i-1];
//			arr[len-i-1]=temp;
			
		}  
		
		System.out.println(rev);
//		String orgStr="";
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			orgStr=orgStr+arr[i]+" ";
//		}
//		System.out.println(orgStr);
		
	}

}
