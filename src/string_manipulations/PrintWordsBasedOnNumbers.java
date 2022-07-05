package string_manipulations;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintWordsBasedOnNumbers {

	public static void main(String[] args) {
		
		
		String str="x1y2z3";
		ArrayList ar=new ArrayList();
		int len=str.length();
		
		
		for(int i=0;i<len-1;i++)
		{
			char alph=str.charAt(i);
		char count=str.charAt(i+1);
		 int counter=Character.getNumericValue(count);
		 
		 for(int j=0;j<counter;j++)
		 {
			 ar.add(alph);
		 }
		 i=i+1;
		
		}
		
		for(int k=0;k<ar.size();k++)
		{
			System.out.print(ar.get(k));
		}
		
		
		
		
		
		
		
	}

}
