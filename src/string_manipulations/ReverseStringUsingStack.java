package string_manipulations;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		String str="Appartment";
		
		disp(str);
	}
	
	public static void disp(String str)
	{
		
		
		
		Deque<Character> stack=new ArrayDeque<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			stack.push(str.charAt(i));
		}
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(stack.pop());
		}
		
	}

}
