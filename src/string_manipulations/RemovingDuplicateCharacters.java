package string_manipulations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateCharacters {

	public static void main(String[] args) {
		
		removeDuplicateChars("sumittmmss");
	}
	
	public static void removeDuplicateChars(String str)
	{
		char[] chArr=str.toCharArray();
		
		int length=chArr.length;
		Set<Character> s=new LinkedHashSet<Character>();
		Set<Character> s1=new LinkedHashSet<Character>();
		
	
		
		for(Character c: chArr)
		{
			if(!s.add(c))
			{
				s1.add(c);
			}
		}
		
		System.out.println("Duplicates are " +s1);
//		s.toString();
//		for(Character c:s1)
//		{
//			System.out.print("Duplicates are " +c +" ");
//		}
	}

}
