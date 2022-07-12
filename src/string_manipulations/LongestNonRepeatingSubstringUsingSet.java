package string_manipulations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestNonRepeatingSubstringUsingSet {

	public static void main(String[] args) {
     
		
		String str="geeksforgeeks";
		
		disp(str);

	}
	
	
	public static void disp(String str)
	{
		if(str==null||str.length()==0)
		{
			System.out.println("Please enter non empty string");
		}
		
		int i=0;
		int j=0;
		int max=0;
		Set<Character> s=new LinkedHashSet<Character>();
		
		while(i<str.length())
		{
			char c=str.charAt(i);
			
			while(s.contains(c))
			{
				s.remove(str.charAt(j));
				++j;
			}
			s.add(c);
			max=Math.max(max, i-j+1);
			++i;
			
		}
		System.out.println("Length of longest substring " +max);
		
		for(Character c1:s)
		{
			System.out.print(c1);
		}
		
	}

}
