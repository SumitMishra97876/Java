package hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortinhHashmapBasedOnvalues {

	public static void main(String[] args) {

     HashMap<String,Integer>hm=new HashMap<String,Integer>();
     

     hm.put("Math", 98);
     hm.put("Data Structure", 85);
     hm.put("Database", 91);
     hm.put("Java", 95);
     hm.put("Operating System", 79);
     hm.put("Networking", 80);
     
     HashMap<String,Integer>hm1=sortByValue(hm);
     
     System.out.println(hm1);
		
		

	}
	
	
	public static HashMap<String, Integer> sortByValue(HashMap<String,Integer>hmap)
	{
		
		List<Map.Entry<String,Integer>> list=new ArrayList<Map.Entry<String,Integer>>(hmap.entrySet());
		
		
		//to sort values on descending order
		//Collections.sort(list,Collections.reverseOrder((i1,i2)->i1.getValue().compareTo(i2.getValue())));
		
		
		//to sort values on ascending order
		Collections.sort(list,(i1,i2)->i1.getValue().compareTo(i2.getValue()));
		HashMap<String,Integer>nmap=new LinkedHashMap<String,Integer>();
		
		for(Map.Entry<String, Integer>s:list)
		{
			
			nmap.put(s.getKey(), s.getValue());
			
		}
		return nmap;
	}

}
