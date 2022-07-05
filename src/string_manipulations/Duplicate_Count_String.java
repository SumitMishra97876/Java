package string_manipulations;


import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;


public class Duplicate_Count_String {
	
	public static void main(final String[] args) {
        final String str = "Java Python Java Javascript scala ruby Python ruby Python";
        duplicateCount(str);
    }
    
    public static void duplicateCount(final String str) {
        final String[] lang = str.split(" ");
        int count = 0;
        final Map<String, Integer> hs = new HashMap<String, Integer>();
        for (int i = 0; i < lang.length; ++i) {
            if (hs.containsKey(lang[i])) {
                count = hs.get(lang[i]);
                ++count;
                hs.put(lang[i], count);
            }
            else {
                hs.put(lang[i], 1);
            }
        }
        final Set<Map.Entry<String, Integer>> s = hs.entrySet();
        for (final Map.Entry<String, Integer> s2 : s) {
            if (s2.getValue() > 1) {
                System.out.println(String.valueOf(s2.getKey()) + "  " + s2.getValue());
            }
        }
    }

}
