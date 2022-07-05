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
		
		for(int i=0;i<carr.length;i++)
		{
			if(!s.add(carr[i]))
			{
				System.out.print(carr[i]);
			}
		}
		
		
	}

}
