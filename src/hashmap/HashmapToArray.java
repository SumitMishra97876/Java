package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class HashmapToArray {

	public static void main(String[] args) {

      HashMap<String,Integer> hm=new HashMap<>();
      
      hm.put("Sumit", 101);
      hm.put("Rahul", 102);
      hm.put("Murg", 103);
      hm.put("Natua", 104);
      hm.put("Sardarwa", 105);
      
      disp(hm);
      
      

	}
	
	public static void disp(HashMap<String,Integer> hm)
	{
		
		ArrayList<Map.Entry<String,Integer>> alist=new ArrayList<>(hm.entrySet());
		
		Object[] ob=new Object[alist.size()];
		
		for(int i=0;i<alist.size();i++)
		{
			ob[i]=alist.get(i);
		}
		
		for(Object o:ob)
		{
			System.out.print(o + " ");
		}
		
	}

}
