package string_manipulations;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test7 {

	public static void main(String[] args) {
		
		
		String names="Ram,Sumit,Ram,Shyam,Sumit,Tim,Tryon,Tim";
		int count=0;
		
		String name[]=names.split(",");
		
		Map<String,Integer> hs=new HashMap<String,Integer>();
		
		for(int i=0;i<name.length-1;i++)
		{
			if(hs.containsKey(name[i]))
			{
				count=hs.get(name[i]);
				count=count+1;
				
				hs.put(name[i], count);
				
			}
			else
			{
				hs.put(name[i], 1);
			}
		}
		Set<Map.Entry<String, Integer>> s = hs.entrySet();
		for(Entry<String,Integer>s1:s)
		{
			System.out.println(String.valueOf(s1.getKey()) + "  " + s1.getValue());
		}
		
		
		

}
}
