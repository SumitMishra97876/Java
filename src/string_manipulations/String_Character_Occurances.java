package string_manipulations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class String_Character_Occurances {

	public static void main(String[] args) {
		StringCharOccurences("sumittmishrrra",'m');
		StringWordOccurences("ncr123ncr45ncr67ncr","ncr");



	}
	
	public static void StringCharOccurences(String str,Character test)
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
			
			if(s1.getKey().equals(test))
			{
				System.out.println(s1.getKey() + "----> " + s1.getValue());
				
		}
		}
		
		
		
	}
	
	
	public static void StringWordOccurences(String str,String test)
	{
		int count=0;
		String[]strArr=str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		
		Map<String,Integer> hs=new LinkedHashMap<String,Integer>();
		
		for(int i=0;i<strArr.length;i++)
		{
			if(hs.containsKey(strArr[i])){
				count=hs.get(strArr[i]);
				count++;
				hs.put(strArr[i], count);
			}
			else
			{
				hs.put(strArr[i], 1);
			}

		}
		
		Set<Map.Entry<String,Integer>> s=hs.entrySet();
		for(Map.Entry<String, Integer> s1:s)
		{
//			if(s1.getValue()>1)
//			{
//			System.out.println(s1.getKey() + "----> " + s1.getValue());
			
			if(s1.getKey().equals(test))
			{
				System.out.println(s1.getKey() + "----> " + s1.getValue());
				
		}
		}
		
		
		
	}


}
