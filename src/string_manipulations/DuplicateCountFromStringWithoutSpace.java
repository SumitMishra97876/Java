package string_manipulations;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCountFromStringWithoutSpace {

	public static void main(String[] args) {
		
		String str="MyTestCaseMyTestCase";
		dupCountWords(str);
		
	

	}
	
	
	public static void dupCountWords(String str)
	{
		String[] strArr=str.split("(?=\\p{Upper})");
		
		Map<String,Integer> hs=new HashMap<String,Integer>();
		int count=0;
		
		for(int i=0;i<strArr.length;i++)
		{
			if(hs.containsKey(strArr[i]))
			{
				count=hs.get(strArr[i]);
				count=count+1;
				
				hs.put(strArr[i], count);
			}
			else
			{
				hs.put(strArr[i], 1);
			}
		}
		
		Set<Map.Entry<String,Integer>> s=hs.entrySet();
		
		for(Entry<String,Integer> s1 : s)
		{
			System.out.println(s1.getKey()  +"-" + s1.getValue());
		}
		
		
		
		
	}

}
