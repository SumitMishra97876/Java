package string_manipulations;

import java.util.HashSet;
import java.util.Set;

public class RemoveDulicateCharsFromString {

	public static void main(String[] args) {
		print("sumitmmtys");

	}
	
	public static void print(String str)
	{
		char[] carr=str.toCharArray();
		
		Set<Character> s=new HashSet<Character>();
		
		for(char ch:carr)
		{
			if(!s.add(ch))
			{
				//System.out.print(carr[i]);
				
				s.add(ch);
			}
		}
		
		for(Character c: s)
		{
			System.out.print(c);
		}
	}

}
