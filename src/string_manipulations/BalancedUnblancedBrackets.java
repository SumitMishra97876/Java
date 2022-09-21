package string_manipulations;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedUnblancedBrackets {

	public static void main(String[] args) {
		
		
		String str="({[]})[]{()}";
		
		if(disp(str))
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
		
		
	}
	
	
	public static boolean disp(String str)
	{
		
		Deque<Character> stack=new ArrayDeque<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			
			if(ch=='(' || ch=='{' || ch=='[')
			{
				stack.push(ch);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char check;
			
			switch(ch)
			{
			case ')':
				check=stack.pop();
				if(check=='[' || check=='{')
					return false;
				break;
			case '}':
				check=stack.pop();
				if(check=='(' || check=='[')
					return false;
				 break;
			case ']':
				check=stack.pop();
				if(check=='(' || check=='{')
					return false;
				break;
			}
		}
		return(stack.isEmpty());
		
		
		
		
	}

}
