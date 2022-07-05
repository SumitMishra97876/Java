package string_manipulations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintingCharsWithNumbersBasedOnOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("sssrrrrrtt");
		
	}
	public static void print(String str)
	{
		Map<Character,Integer> hs=new LinkedHashMap<Character,Integer>();
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(hs.containsKey(str.charAt(i)))
			{
				count=hs.get(str.charAt(i));
				count++;
				hs.put(str.charAt(i), count);
			}
			else
			{
				hs.put(str.charAt(i), 1);
			}
		}
		
		
		 Set<Map.Entry<Character,Integer>> s=hs.entrySet();
		 
		 for(Map.Entry<Character,Integer> s1:s)
		 {
			 System.out.print(s1.getKey()+""+s1.getValue());
		 }
		
		
	}

}
