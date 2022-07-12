package string_manipulations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LongestNonRepeatinSubString {

	public static void main(String[] args) {
		
     String str="geeksforgeeks";
     
     disp(str);
	}
	
	
	public static void disp(String str)
	{
		
		int max_length=0;
		int start=0;
		HashMap<Character,Integer> hs=new LinkedHashMap<Character,Integer>();
		
		for(int end=0;end<str.length();end++)
		{
			if(hs.containsKey(str.charAt(end)))
			{
				start=Math.max(start, hs.get(str.charAt(end))+1);
			}
			
			hs.put(str.charAt(end), end);
			
			max_length=Math.max(max_length, end-start+1);
		}
		
		System.out.println("longest substring " +max_length);
		
		Set<Map.Entry<Character,Integer>>s=hs.entrySet();
		
		for(Map.Entry<Character, Integer>s1:s)
		{
			System.out.print(s1.getKey());
		}
		
	}
	
	

}
