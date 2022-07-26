package string_manipulations;

import java.util.stream.IntStream;

public class StringRemoveSpaceToUpperEvenPosition {

	public static void main(String[] args) {


		String str="My Name is Qa";
//		
//	     String input=str.replace(" ","");
//	     IntStream.range(0, input.length())
//	     .mapToObj(i->i%2==0?String.valueOf(input.charAt(i)):String.valueOf(input.charAt(i)).toUpperCase()).forEach(System.out::print);
		
		disp(str);
		

	}
	
	
	public static void disp(String str)
	{
		
		String str1=str.replace(" ", "");
		char[] chArr=str1.toCharArray();
		
		
		for(int i=0;i<chArr.length;i++)
		{
			if(i%2==0)
			{
				chArr[i]=Character.toUpperCase(chArr[i]);
			}
			
		}
		
		String str2="";
		
		for(char c:chArr)
		{
			str2=str2+c;
		}
		System.out.println(str2);
		
	}

}
