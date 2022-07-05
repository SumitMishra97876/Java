package hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMap_Compare {
	
	
	public static void main( String[] args) {
        final Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
         Map<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(3, "C");
        map2.put(1, "A");
        map2.put(2, "B");
         Map<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");
        map3.put(4, "C");
        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));
        Map<Integer, String> map4 = new HashMap<Integer, String>();
        map4.put(1, "A");
        map4.put(2, "B");
        map4.put(3, "C");
        map4.put(4, "D");
//         HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
//        combineKeys.addAll((Collection<Integer>)map4.keySet());
//        combineKeys.removeAll(map1.keySet());
       // System.out.println(combineKeys);
        System.out.println(new ArrayList(map1.values()).equals(new ArrayList(map2.values())));
        System.out.println(new ArrayList(map1.values()).equals(new ArrayList(map3.values())));
        System.out.println(new HashSet(map1.values()).equals(new HashSet(map2.values())));
        System.out.println(new HashSet(map1.values()).equals(new HashSet(map3.values())));
    }

}
