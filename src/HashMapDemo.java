import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(final String[] args) {
        final HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(101, "John");
        m.put(102, "Mary");
        m.put(103, "Jack");
        m.put(104, "Ron");
        m.put(105, "Trey");
        System.out.println(m);
        System.out.println(m.get(103));
        System.out.println(m.remove(102));
        System.out.println(m.containsKey(105));
        System.out.println(m.containsValue("ron"));
        System.out.println(m.isEmpty());
        System.out.println(m.size());
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
        for (final Object i : m.keySet()) {
            System.out.println(i);
        }
        for (final Object i : m.values()) {
            System.out.println(i);
        }
        System.out.println();
        for (final Object i : m.entrySet()) {
            System.out.println(i);
        }
        System.out.println();
        for (final Object i : m.keySet()) {
            System.out.println(i + "  " + m.get(i));
        }
        System.out.println("*************************************************************************");
        for ( Map.Entry entry : m.entrySet()) {
            System.out.println(entry.getKey() + "       " + entry.getValue());
        }
        System.out.println("############################################################################");
        
        for ( Map.Entry entry2 : m.entrySet()) {
            System.out.println(entry2.getKey() + "                " + entry2.getValue());
        }
    }

}
