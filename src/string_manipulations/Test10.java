package string_manipulations;

import java.util.Arrays;

public class Test10 {

	public static void main(String[] args) {

		String str = "This is Apple";
		test(str);

	}

	public static void test(String str)
	{
		String[] arr=str.split(" ");
		String rev="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i] +" ";
			
		
		
		
	}
		
		String[] arr2=rev.split(" ");
		
		String str1=arr2[2];
		
		arr2[2]=rev(str1);
		String orr="";
		
	     for(int i=0;i<arr2.length;i++)
	     {
	    	 orr=orr+arr2[i]+ " ";
	     }
	     System.out.println(orr);
		
		
		

}
	public static String rev(String str)
	{
		String rev1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev1=rev1+str.charAt(i);
		}
		return rev1;
	}
}
