package string_manipulations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String_Words_Count {

	public static void main(String[] args) {
		String str="Jan,Feb,Jan,Mar,jan,Feb,Apr,Jan,Feb,Jan,Feb,Apr,Mar,Apr,Mar";
		test(str);

	}
	
	public static void test(String str)
	{
		String[] months=str.split(",");
		
		int len=months.length;
		
		int count=0;
		
		Map<String,Integer> hs=new LinkedHashMap<String,Integer>();
		
		for(int i=0;i<len;i++)
		{
			if(hs.containsKey(months[i]))
				{
				  count=hs.get(months[i]);
				  count=count+1;
				  hs.put(months[i], count);
				}
			else
			{
				hs.put(months[i], 1);
				
			}
		}
		
		Set<Map.Entry<String,Integer>> s=hs.entrySet();
		
		for(Entry<String, Integer> s1:s)
		{
			if(s1.getValue()>=3)
			System.out.println(s1.getKey() + "=" +s1.getValue());
		}
	}

}
