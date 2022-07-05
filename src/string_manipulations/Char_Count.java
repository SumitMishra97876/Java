package string_manipulations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Char_Count {
	
	
	public static void main(final String[] args) {
        final String str = "dddeefggggghhhhhhhhhhhhhhhhkkkkkkkkkrrrstw";
        char_count(str);
    }
    
    public static void char_count(final String str) {
        int count = 0;
        final Map<Character, Integer> hs = new HashMap<Character, Integer>();
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
            System.out.print(new StringBuilder().append(s2.getKey()).append(s2.getValue()).append(" ").toString());
        }
    }

}
