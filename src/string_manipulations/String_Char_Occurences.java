package string_manipulations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class String_Char_Occurences {
	
	
	 public static void main(String[] args) {
	        final String str = "rrrffagggg";
	        occurences(str);
	    }
	    
	    public static void occurences(final String str) {
	        int count = 0;
	         Map<Character, Integer> hs = new HashMap<Character, Integer>();
	        for (int i = 0; i < str.length(); ++i) {
	            if (hs.containsKey(str.charAt(i))) {
	                count = hs.get(str.charAt(i));
	                ++count;
	                hs.put(str.charAt(i), count);
	            }
	            else {
	                hs.put(str.charAt(i), 1);
	            }
	        }
	        Set<Map.Entry<Character, Integer>> s = hs.entrySet();
	        for ( Map.Entry<Character, Integer> s2 : s) {
	            System.out.print(new StringBuilder().append(s2.getKey()).append(s2.getValue()).toString());
	        }
	    }

}
