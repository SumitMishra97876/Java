package string_manipulations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateCharacters {

	public static void main(String[] args) {
		
		removeDuplicateChars("sumittmm");
	}
	
	public static void removeDuplicateChars(String str)
	{
		char[] chArr=str.toCharArray();
		
		int length=chArr.length;
		Set<Character> s=new LinkedHashSet<Character>();
		
		for(Character c: chArr)
		{
			s.add(c);
		}
		
		s.toString();
		for(Character c:s)
		{
			System.out.print(c);
		}
	}

}
