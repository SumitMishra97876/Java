package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSort {

	public static void main(String[] args) {
		 HashMap<Integer, String> unSortedMap = new HashMap<>();
	     
		    unSortedMap.put(14, "Aayushi");
		    unSortedMap.put(20, "Rachit");
		    unSortedMap.put(60, "Amit");
		    unSortedMap.put(70, "Anamika");
		      
   LinkedHashMap<Integer,String> ls=new LinkedHashMap<Integer,String>();
   
   unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
   .forEachOrdered(i->ls.put(i.getKey(), i.getValue()));
   System.out.println(ls);
   
   
//   unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
//   .forEachOrdered(i->ls.put(i.getKey(), i.getValue()));
//   System.out.println(ls);{14=Aayushi, 20=Rachit, 60=Amit, 70=Anamika}
	}

}
