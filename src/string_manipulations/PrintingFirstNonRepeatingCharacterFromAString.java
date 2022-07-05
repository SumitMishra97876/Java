package string_manipulations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintingFirstNonRepeatingCharacterFromAString {

	public static void main(String[] args) {
         String str="xcvccxvbpoipo";
		StringCharOccurences(str);

	}
	
	
	public static void StringCharOccurences(String str)
	{
		int count=0;
		
		Map<Character,Integer> hs=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			if(hs.containsKey(str.charAt(i))){
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
		for(Map.Entry<Character, Integer> s1:s)
		{
//			if(s1.getValue()>1)
//			{
//			System.out.println(s1.getKey() + "----> " + s1.getValue());
			
			if(s1.getValue()==1)
			{
				System.out.println("First Non Repeating Character is " +s1.getKey());
				break;
				
		}
		}
		
		
		
	}


}
