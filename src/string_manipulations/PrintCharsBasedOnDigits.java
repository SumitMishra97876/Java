package string_manipulations;

import java.util.ArrayList;

public class PrintCharsBasedOnDigits {

	public static void main(String[] args) {
		print("s3r5t2");

	}
	
	public static void print(String str)
	{
		
		ArrayList arr=new ArrayList();
		
		int len=str.length();
		
		for(int i=0;i<len-1;i++)
		{
			char c=str.charAt(i);
			char count=str.charAt(i+1);
			int counter=Character.getNumericValue(count);
			
			for(int j=0;j<counter;j++)
			{
				arr.add(c);
			}
			i=i+1;
		}
		
		for(int k=0;k<arr.size();k++)
		{
			System.out.print(arr.get(k));
		}
		
	}

}
