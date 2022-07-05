package string_manipulations;

import java.util.Stack;

public class Reverse_String_Using_Stack {

	public static void main(String[] args) {
		String str="I love India";
		char c[]=str.toCharArray();
		String s="";
		
//		int len=str.length();
//		
//		String rev="";
//		for(int i=len-1;i>=0;i--)
//		
//		{
//			rev=rev+str.charAt(i);
//			
//		}
//		System.out.println(rev);
//		
//		char ch[]=rev.toCharArray();
		
		Stack stack = new Stack();
		
		for(int i=0;i<c.length;i++)
		{
			stack.push(c[i]);
		}
		
		//System.out.print(stack);
		for(int i=0;i<c.length;i++)
		{
		
		 s=s+String.valueOf(stack.pop());
		
		
	}
		System.out.println(s);

}
}
