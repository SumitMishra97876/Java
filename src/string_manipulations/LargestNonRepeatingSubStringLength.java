package string_manipulations;

import java.util.HashMap;

public class LargestNonRepeatingSubStringLength {

	public static void main(String[] args) {

     String str="Sumit";
     disp(str);

	}
	
	public static void disp(String str)
	{
		
		int start=0;
		int max_length=0;
		int end;
		
		HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
		
		
		for(end=0;end<str.length();end++)
		{
			if(hs.containsKey(str.charAt(end)))
			{
				start=Math.max(start, hs.get(str.charAt(end))+1);
			}
			hs.put(str.charAt(end), end);
			
			max_length=Math.max(max_length, end-start+1);
		}
		
		System.out.println(max_length);
	}

}
