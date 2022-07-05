package string_manipulations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Occurrence_Of_Characters {
	
	
	public static void main(final String[] args) {
        final String str = "I am most unfortunate";
        final HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        int count = 0;
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
        final Set<Map.Entry<Character, Integer>> s = hs.entrySet();
        for (final Map.Entry<Character, Integer> s2 : s) {
            if (s2.getValue() > 1) {
                System.out.println(s2.getKey() + " " + s2.getValue());
            }
        }
    }

}
